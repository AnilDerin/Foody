package com.anilderin.foody.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.anilderin.foody.models.FoodRecipe
import com.anilderin.foody.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}