package lesson11

fun main() {

}

class RecipeCategory(
    val id: Int,
    val nameCategories: String,
    val recipes: MutableList<Recipe> = mutableListOf(),
)

class Recipe(
    val id: Int,
    val nameRecipe: String,
    val ingredientsList: MutableList<Ingredient> = mutableListOf(),
    val methodCooking: String,
    var inFavorite: Boolean = false,
)

class Ingredient(
    val id: Int,
    val countOfPortions: Int,
    val nameOfIngredient: String,
    val countOfIngredients: Int,
    val unitsOfMeasurement: String,
)


