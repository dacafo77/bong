package com.example.myapplication.Main

open class Burger(val name: String, val price: Int) {
    fun displayInfo() {
        println("$name")
        println("$price 원")
    }
}

fun main() {

    val menu =
        "아래의 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                "[ SHAKESHACK MENU ]\n" +
                "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n" +
                "2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림\n" +
                "3. Drinks          | 매장에서 직접 만드는 음료\n" +
                "4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주\n" +
                "0. 종료             | 프로그램 종료"

    while (true) {
        println(menu)
        val select = readLine()?.toInt()


        when (select) {
            1 -> {
                burgersMenu()
            }

            2 -> {
                icecreamMenu()
            }

            0 -> {
                println("프로그램을 종료합니다")
                return
            }

            else -> {
                println("보기의 항목을 골라주세요")
            }
        }
    }
}

fun burgersMenu() {
    println("Burgers MENU")
    println("1. Shack Burger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
    println("2. Smoke Shack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
    println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
    println("4. Cheese Burger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
    println("5. Ham Burger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
    println("0. 뒤로가기      | 뒤로가기)")

    while (true) {
        val burgerMenu = readLine()?.toInt()
        when (burgerMenu) {
            1 -> {
                val shackBurger = Burger("Shack Burger", 5000)
                shackBurger.displayInfo()
            }

            2 -> {
                val smokeshack = Burger("Smoke Shack", 5500)
                smokeshack.displayInfo()
            }

            3 -> {
                val cheeseburger = Burger("Cheese Burger", 6000)
                cheeseburger.displayInfo()
            }

            4 -> {
                val cheeseburger = Burger("Cheese Burger", 6500)
                cheeseburger.displayInfo()
            }

            5 -> {
                val hamBurger = Burger("Ham Burger", 7000)
                hamBurger.displayInfo()
            }

            0 -> {
                println("메인메뉴로 돌아갑니다.")
                return
            }

            else -> {
                println("보기의 항목을 골라주세요")
            }
        }
    }
}


fun icecreamMenu() {
    println("Forzen Custard MENU")
    println("1. ...")
    println("2. ...")
    println("3. ...")
    println("4. ...")
    println("0. 뒤로가기      | 뒤로가기)")

    while (true) {
        val icecreamMenu = readLine()?.toInt()
        when (icecreamMenu) {
            1 -> println("1번이 선택되었습니다")
            2 -> println("2번이 선택되었습니다")
            3 -> println("3번이 선택되었습니다")
            4 -> println("4번이 선택되었습니다")
            0 -> {
                println("메인메뉴로 돌아갑니다.")
                return
            }

            else -> {
                println("보기의 항목을 골라주세요")
            }
        }
    }


}




