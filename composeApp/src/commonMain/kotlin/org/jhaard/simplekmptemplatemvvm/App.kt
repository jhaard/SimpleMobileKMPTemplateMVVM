package org.jhaard.simplekmptemplatemvvm

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.jhaard.simplekmptemplatemvvm.modules.appViewModelModule
import org.jhaard.simplekmptemplatemvvm.modules.appNetworkModule
import org.jhaard.simplekmptemplatemvvm.modules.appPreferencesModule
import org.jhaard.simplekmptemplatemvvm.modules.appRepositoryModule
import org.jhaard.simplekmptemplatemvvm.navigation.Navigation
import org.koin.compose.KoinApplication
import org.koin.compose.KoinApplicationPreview
import org.koin.core.logger.Level


/**
 * Entry point composable App(), starting Koin and print its starting process.
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
                modules = listOf(
                    appNetworkModule,
                    appPreferencesModule,
                    appRepositoryModule,
                    appViewModelModule
                )
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
    KoinApplicationPreview(application = {
        modules(
            modules = listOf(
                appNetworkModule,
                appPreferencesModule,
                appRepositoryModule,
                appViewModelModule
            )
        )
    }) {
        App()
    }
}