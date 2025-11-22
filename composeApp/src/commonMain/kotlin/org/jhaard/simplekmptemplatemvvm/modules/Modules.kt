package org.jhaard.simplekmptemplatemvvm.modules


import org.jhaard.simplekmptemplatemvvm.viewmodels.FirstScreenViewModel
import org.jhaard.simplekmptemplatemvvm.viewmodels.SecondScreenViewModel
import org.koin.dsl.module
import org.koin.core.module.dsl.viewModel

/**
 * Koin modules
 * Using Koin via documentation:
 * https://insert-koin.io/docs/reference/koin-compose/compose
 *
 */
val appViewModels = module {
    viewModel { FirstScreenViewModel() }
    viewModel { SecondScreenViewModel() }
}