package com.example.guest.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.guest.ui.theme.Purple40



@Composable
fun Greeting(
    modifier: Modifier = Modifier,
    user: com.example.guest.ui.screens.User? = null,
    navController: NavController
) {
    var email by remember { mutableStateOf(user?.email ?: "") }
    var password by remember { mutableStateOf(user?.password ?: "") }
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Login",
                style = MaterialTheme.typography.titleMedium, color = Purple40,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                label = { Text("E-mail") },
                value = email,
                onValueChange = { email = it }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                label = { Text("Senha") },
                value = password,
                visualTransformation = PasswordVisualTransformation(),
                onValueChange = { password = it }
            )
            Spacer(modifier = Modifier.height(8.dp))
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    navController.navigate("guestList")
                },
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text("Salvar")
            }
            Spacer(modifier = Modifier.height(1.dp))
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = MaterialTheme.colorScheme.onSurface
                ),
            ) {
                Text(
                    text = "Esqueci minha senha",
                    style = MaterialTheme.typography.labelSmall,
                    color = Purple40,
                    textDecoration = TextDecoration.Underline,
                )
            }
            Spacer(modifier = Modifier.height(1.dp))
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = MaterialTheme.colorScheme.onSurface
                )
            ) {
                Text(
                    text = "Cadastrar-se",
                    style = MaterialTheme.typography.labelSmall,
                    color = Purple40,
                    textDecoration = TextDecoration.Underline,
                )
            }
        }
    }
}
data class User(
    val email: String,
    val password: String,
)