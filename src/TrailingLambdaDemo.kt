package com.example

fun createSpaceShip(prepare: SpaceShip.() -> String) : SpaceShip{
    val spaceShip = SpaceShip("Default", 1)
    val status = spaceShip.prepare()
    println("Ship status $status")
    return spaceShip
}

fun main() {
    val ship = createSpaceShip {
        this.name = "Mike"
        this.fuel = 100
        "Fuelled up and name set to Mike"
    }
    println(ship)
}

