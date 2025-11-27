package com.example.myroomsatu.view.uicontroller

// Import standar Android & Compose
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myroomsatu.view.EntrySiswaScreen
import com.example.myroomsatu.view.HomeScreen
import com.example.myroomsatu.view.route.DestinasiHome
import com.example.myroomsatu.view.route.DestinasiEntry


@Composable
fun SiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    HostNavigasi(navController = navController)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {
        // Halaman Home
        composable(route = DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {
                    navController.navigate(route = DestinasiEntry.route)
                }
            )
        }

        // Halaman Entry Siswa
        composable(route = DestinasiEntry.route) {
            EntrySiswaScreen(
                navigateBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}