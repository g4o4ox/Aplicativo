import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun RollGame(navController: NavController) {
    val rolColors = listOf(
        Color.Blue,
        Color.Green,
        Color.Yellow,
        Color.Red,
        Color.Magenta,
        Color.Cyan
    )

    val segAngular = List(rolColors.size) { 360f / rolColors.size }
    val rollSize = 300.dp
    var rotationState by remember { mutableStateOf(0f) }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Canvas(modifier = Modifier.size(rollSize)) {
            rotate(rotationState) {
                var startAngle = 0f
                for (i in rolColors.indices) {
                    drawArc(
                        color = rolColors[i],
                        startAngle = startAngle,
                        sweepAngle = segAngular[i],
                        useCenter = true,
                        topLeft = Offset(0f, 0f),
                        size = size
                    )
                    startAngle += segAngular[i]
                }
            }
        }

        Button(onClick = {
            rotationState += (360 * 5 + (0..359).random()).toFloat()
        }) {
            Text("Girar")
        }
    }
}
