package com.cnon.awhile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var pl:Int = 8

        while(pl<60)
        {
            pl++
            if(pl==20)

               // println("20 sayısı ekrana yazılmadan döngü başa geçip 21 olacaktır")
                continue



            println(pl)

            if(pl==38)
                // break ile 38 e gelince döngü sonlanıyor
                break
        }



      distakidongu@  for(x in 1..100)
        {
            for(y in 70..200 step 3)
            {
                println("$x,$y")
                if(x==5) break@distakidongu
            }
        }

        // return un yazıldığı yerde mevcut fonksiyon sonlandırılır, bir üst fonksiyona dönülüp fonksiyon kaldığı yerden devam eder
        return

        println("Fonksiyondan return kullanılarak çıkılırsa bu yazı ekrana yazılmayacaktır.")






    }
}