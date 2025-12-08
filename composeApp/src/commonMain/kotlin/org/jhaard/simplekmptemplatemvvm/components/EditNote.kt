package org.jhaard.simplekmptemplatemvvm.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun EditNote(text: String, onTextChange: (String) -> Unit, onSaveClick: () -> Unit) {
    TextField(
        value = text,
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth()
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(20.dp)),
        onValueChange = onTextChange,
        label = { Text("Write note...") },
        colors = TextFieldDefaults.colors(
            focusedTextColor = Color.Black,
            unfocusedTextColor = Color.Black,
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            unfocusedLabelColor = Color.Black,
            focusedLabelColor = Color.Black
        )
    )

    Spacer(
        modifier = Modifier.height(10.dp)
    )

    Button(
        onClick = onSaveClick
    ) {
        Text(text = "Save")
    }

}