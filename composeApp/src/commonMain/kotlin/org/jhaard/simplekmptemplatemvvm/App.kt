package org.jhaard.simplekmptemplatemvvm

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.jhaard.simplekmptemplatemvvm.modules.appViewModels
import org.jhaard.simplekmptemplatemvvm.navigation.Navigation
import org.koin.compose.KoinApplication
import org.koin.compose.KoinApplicationPreview
import org.koin.core.logger.Level


/**
 * Entry point composable App(), starting Koin and print its process.
 * Using Koin via documentation:
 * https://insert-koin.io/docs/reference/koin-compose/compose
 *
 */
@Composable
fun App() {
    KoinApplication(
        application = {
            printLogger(level = Level.INFO)
            modules(
                modules = appViewModels
            )
        },
        content = {
            MaterialTheme {

                Navigation()

            }
        }
    )

}

@Preview
@Composable
fun PreviewApp() {
    KoinApplicationPreview(application = { modules(appViewModels) }) {
        App()
    }
}