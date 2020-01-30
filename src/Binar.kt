import java.util.*

fun main (){
    //print hasil dari kelas java
   // val input = Scanner(System.`in`)
    val person = Main()
    print(person.name)
    println()

    //tipe data di dikotlin
    //string
    val nama = "Nug"
    var kelas = "02"
    print("Saya  $nama \n")
    print ("kelas  $kelas")

    println()

    //untuk output char secara perulangan
    for (i in 0 until (nama.length)){
        print(nama[i])
    }

    //mengganti character
    var namaBaru = nama.replace("u", "a")

    print("\n nama baru nih $namaBaru")

    //menghapus karakter
    var hurufKurang = nama.removeRange(0,2)
    print("\n $hurufKurang")

    //tipe data integer
    //val nilai bisa diubah-ubah
    //var nilai tidak bisa diubah
    println()

    var angka = 200
    println(angka)
    /* mengganti nilai angka
    print("\n Mau ganti angka berapa ? ")
    angka = input.nextInt()
    println()
    print("angka telah berganti : $angka")*/

    //operasi pertambahan dan pengurangan
    //penjumlahan
    println("hasil ${angka+5}")
    //pengurangan
    println("hasil ${angka-20}")
    //pembagian
    println("hasil ${angka/10}")
    //perkalian
    println("hasil ${angka*1}")

    //tipe data boolean
    val bool = true
    val bool1 = false
    println(bool && bool1)
    println(bool || bool1)

    if(bool){
        println(bool)
    }else print(bool1)

    //array
    var arrayNumber = arrayOf(1,2,3,4,5,6,7)
    //3 cara pemanggilan
    arrayNumber.forEach {
        print(it)
    }
    println()
    for (i in arrayNumber.indices){
        print(arrayNumber[i])
    }
    println()
    for (i in 0 until arrayNumber.size){
        print(arrayNumber[i])
    }

    //array string
    println()
    var arrayString = arrayOf("Nug","Nag","Nig")
    arrayString.forEachIndexed {
        index, i ->
        println("index ke : $index adalah $i")
    }


    //list (bebas mau nyimpan berapa banyak, dinamis)
    var listAngka = listOf(1,2,3,4,5,6)
    listAngka.forEach{
        print(it)
    }
    println()
    for (i in 0 until listAngka.size){
        print(listAngka[i])
    }

    println()

    //mutable list
    var listNama = mutableListOf<String>()
    listNama.add("Nug")
    listNama.add("Nug")
    listNama.add("Nug")
    listNama.add("Nug")
    listNama.add(1,"Anugrah") //penambahan isi array, dengan index tertentu
    if (listNama.isEmpty()){
        println("Kosong")
    }else
        listNama.forEach{
            println(it)
        }

    //penghapusan semua element
    //listNama.clear()

    //penghapusan sesuai index berapa
    //listNama.removeAt(2)

}