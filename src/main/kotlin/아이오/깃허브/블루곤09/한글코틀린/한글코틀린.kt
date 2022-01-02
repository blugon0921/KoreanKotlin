package 아이오.깃허브.블루곤09.한글코틀린

class 한글코틀린 {
    companion object {
        @JvmStatic
        fun main(인수 : Array<String>) {
            val 헬로월드 = arrayListOf("헬", "로", ",", " ", "월", "드", "!")

            var 마지막 = ""
            for(헬 in 헬로월드) {
                마지막 += 헬
            }

            println(마지막)
        }
    }
}