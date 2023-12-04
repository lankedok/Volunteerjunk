package com.example.volunteerjunk.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.volunteerjunk.CardSimple
import com.example.volunteerjunk.R
import com.example.volunteerjunk.TextFieldSimple
import kotlinx.coroutines.CoroutineScope

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(

//        onLoginClick: () -> Unit
) {
    val scope = rememberCoroutineScope()

    val emailValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }




    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(28.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = stringResource(id = R.string.hello_title),
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 40.dp),
                style = TextStyle(fontSize = 24.sp),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(40.dp))
            CardSimple(R.string.useful_link)
            Spacer(modifier = Modifier.height(40.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = stringResource(id = R.string.user_name)) },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Black,
                    focusedLabelColor = Color.Black,
                    cursorColor = Color.Black,
                ),
                keyboardOptions = KeyboardOptions.Default,
                value = emailValue.value,
                onValueChange = { emailValue.value = it },
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = stringResource(id = R.string.user_password)) },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Black,
                    focusedLabelColor = Color.Black,
                    cursorColor = Color.Black,
                ),
                keyboardOptions = KeyboardOptions.Default,
                value = passwordValue.value,
                onValueChange = { passwordValue.value = it },
            )
            Spacer(modifier = Modifier.height(40.dp))

            OutlinedButton(
                onClick = { },
                modifier = Modifier.fillMaxWidth(),

                ) {
                Text(
                    text = stringResource(id = R.string.enter_button),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}