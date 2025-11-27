package com.example.myroomsatu.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myroomsatu.repositori.AplikasiSiswa
import com.example.myroomsatu.viewmodel.EntryViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {

        // Initializer untuk HomeViewModel
        initializer {
            _root_ide_package_.com.example.myroomsatu.viewmodel.HomeViewModel(
                repositoriSiswa = aplikasiSiswa().container.repositoriSiswa
            )
        }

        // Initializer untuk EntryViewModel
        initializer {
            EntryViewModel(
                repositoriSiswa = aplikasiSiswa().container.repositoriSiswa
            )
        }
    }
}

/**

 */
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)