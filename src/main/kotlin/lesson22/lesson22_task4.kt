package lesson22

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}

class MainScreenViewModel {
    data class MainScreenState(
        val data: String = "",
        val isLoading: Boolean = false
    )

    var mainScreenState: MainScreenState = MainScreenState()
    fun loadData() {
        mainScreenState = MainScreenState("", false)
        println(mainScreenState)
        mainScreenState = mainScreenState.copy(isLoading = true)
        println(mainScreenState)
        mainScreenState = mainScreenState.copy(data = "Данные загружены", isLoading = false)
        println(mainScreenState)
    }
}