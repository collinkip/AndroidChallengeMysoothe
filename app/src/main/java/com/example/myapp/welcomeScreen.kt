package com.example.myapp
import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.ui.theme.MyAppTheme
import com.example.myapp.ui.theme.red

@SuppressLint("InvalidColorHexValue")
@Composable
fun WelcomeScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        WelcomeBackground()

        ButtonColumn(
            modifier = Modifier.align(Alignment.Center))
    }

}

@Composable
private fun ButtonColumn(
    modifier: Modifier,
) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(horizontal = 16.dp)
        ){
        AppLogo()
        Spacer(modifier = Modifier.height(32.dp))
        MySootheButton(onClick = { /*TODO*/ }, buttonText = "SIGN UP")
        Spacer(modifier = Modifier.height(8.dp))

        MySootheButton(
            onClick = { /*TODO*/ }, buttonText = "SIGN IN", containerColor = MaterialTheme.colorScheme.secondary
        )
    }
}

@Composable
private fun AppLogo() {
    val isDark = isSystemInDarkTheme()
    val appLogoRes = if (isDark) {
        R.drawable.dark_logo
    } else {
        R.drawable.light_logo
    }
    Image(
        painter = painterResource(id = appLogoRes),
        contentDescription = "My logo"
    )
}

@Composable
private fun WelcomeBackground() {
    val isDark = isSystemInDarkTheme()
    val backgroundResource = if (isDark) {
        R.drawable.dark_welcome
    } else {
        R.drawable.light_welcome
    }
    Image(
        painter = painterResource(id = backgroundResource),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
}


@Preview(
    name = "Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
private fun WelcomeScreenPreview(){
    MyAppTheme{
        WelcomeScreen()
    }

}

