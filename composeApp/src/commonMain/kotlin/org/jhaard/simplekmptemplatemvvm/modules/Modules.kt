package org.jhaard.simplekmptemplatemvvm.modules


import com.russhwolf.settings.Settings
import io.ktor.client.HttpClient
import org.jhaard.simplekmptemplatemvvm.httpClient.createHttpClient
import org.jhaard.simplekmptemplatemvvm.localPrefs.SettingsPreferences
import org.jhaard.simplekmptemplatemvvm.repositories.Repository
import org.jhaard.simplekmptemplatemvvm.viewmodels.FirstScreenViewModel
import org.jhaard.simplekmptemplatemvvm.viewmodels.SecondScreenViewModel
import org.koin.dsl.module
import org.koin.core.module.dsl.viewModel
import org.koin.core.qualifier.named

/**
 * Koin modules
 * Using Koin via documentation:
 * https://insert-koin.io/docs/reference/koin-compose/compose
 *
 */

// Network
val appNetworkModule = module {
    // Name optional for this example.
    single<HttpClient>(named("public")) { createHttpClient() }
}

// Local Preferences
val appPreferencesModule = module {
    single<Settings> { Settings() }
    single<SettingsPreferences> { SettingsPreferences(settings = get()) }
}

// Repos
val appRepositoryModule = module {
    single<Repository> { Repository(client = get(named(name = "public"))) }
}

// ViewModels
val appViewModelModule = module {
    viewModel { FirstScreenViewModel(repository = get()) }
    viewModel { SecondScreenViewModel() }
}