package org.jhaard.simplekmptemplatemvvm.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import org.jhaard.simplekmptemplatemvvm.models.Note

@Composable
fun NoteList(notes: List<Note>) {
    Text(
        text = "Note list",
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )

    LazyColumn(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        state = rememberLazyListState(),
        userScrollEnabled = true
    ) {
        items(notes) { item ->
            Text(
                text = item.text,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(18.dp)
            )
            HorizontalDivider(modifier = Modifier.padding(horizontal = 10.dp))
        }
    }

}