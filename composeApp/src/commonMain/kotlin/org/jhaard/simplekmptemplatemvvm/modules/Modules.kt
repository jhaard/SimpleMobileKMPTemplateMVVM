package org.jhaard.simplekmptemplatemvvm.modules


import org.jhaard.simplekmptemplatemvvm.viewmodels.FirstScreenViewModel
import org.jhaard.simplekmptemplatemvvm.viewmodels.SecondScreenViewModel
import org.koin.dsl.module
import org.koin.core.module.dsl.viewModel

val appViewModels = module {
    viewModel { FirstScreenViewModel() }
    viewModel { SecondScreenViewModel() }
}