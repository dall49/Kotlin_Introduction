
class UserAdmins<T>(credit:T){
    init {
        println(credit)
    }
}


fun main() {
    var userAdmin = UserAdmins<String>("Admin")
    var userAdmin2 = UserAdmins<Int>(123)
    var a = UserAdmins<Double>(12.8)
}