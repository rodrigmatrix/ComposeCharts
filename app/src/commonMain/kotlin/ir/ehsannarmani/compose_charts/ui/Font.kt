package ir.ehsannarmani.compose_charts.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.github.rodrigmatrix.app.generated.resources.Res
import com.github.rodrigmatrix.app.generated.resources.ubuntu
import org.jetbrains.compose.resources.Font

val ubuntu @Composable
get() = FontFamily(
    listOf(
        Font(Res.font.ubuntu, FontWeight.Normal),
    )
)