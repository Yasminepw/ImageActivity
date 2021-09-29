package edu.temple.imageactivity

data class Images(val id: Int, val title: String, val resourceId: Int) {

}

 fun photoList(): List<Images> {
    return listOf(
        Images(
            id = 1,
            title = "Burger",
            resourceId = R.drawable.burger
        ),
        Images(
            id = 2,
            title = "Ham",
            resourceId = R.drawable.ham
        ),
        Images(
            id = 3,
            title = "Ice Cream",
            resourceId = R.drawable.icecream
        ),
        Images(
            id = 4,
            title = "Nigiri",
            resourceId = R.drawable.nigiri
        ),
        Images(
            id = 5,
            title = "Pancake",
            resourceId = R.drawable.pancake
        ),
        Images(
            id = 6,
            title = "Pizza",
            resourceId = R.drawable.pizza
        ),
        Images(
            id = 7,
            title = "Ramen",
            resourceId = R.drawable.ramen
        ),
        Images(
            id = 8,
            title = "Ribs",
            resourceId = R.drawable.ribs
        ),
        Images(
            id = 9,
            title = "Sauce",
            resourceId = R.drawable.sauce
        ),
        Images(
            id = 10,
            title = "Skewer",
            resourceId = R.drawable.skewer
        ),
        Images(
            id = 11,
            title = "Sushi",
            resourceId = R.drawable.sushi
        ),
        Images(
            id = 12,
            title = "Taco",
            resourceId = R.drawable.taco
        )
    )
}

