package com.example.cooklog.data.seed

import com.example.cooklog.R
import com.example.cooklog.data.local.entity.RecipeEntity

object RecipeSeedData {

    val recipes = listOf(

        RecipeEntity(
            id = 1,
            title = "Bebek Peking",
            tags = "oriental,chinese,duck",
            cookingTime = "3 jam",
            ingredients = """
                - 1 ekor bebek ukuran sedang
                - 3 sdm madu atau gula diet
                - 1 sdt jahe bubuk atau 1 ruas jahe, parut
                - 1 sdm minyak wijen
                - 3 sdm kecap manis
                - 2 sdm kecap asin
                - Garam secukupnya
                - Air secukupnya
                - Serai secukupnya

                Bahan saus:
                - 2 sdm kecap manis
                - 1 sdm kecap asin
                - 1 sdm minyak zaitun
                - 1 sdt minyak wijen
                - 1 ruas jahe, parut
                - Cabai rawit secukupnya
            """.trimIndent(),
            steps = """
                1. Cuci bersih bebek lalu tiriskan.
                2. Lumuri seluruh permukaan bebek dengan cuka, diamkan 2 jam di kulkas.
                3. Rebus bebek dengan air, serai, dan garam hingga setengah matang.
                4. Tiriskan hingga kering.
                5. Campur madu, jahe, minyak wijen, kecap manis, dan kecap asin.
                6. Lumuri bebek hingga rata.
                7. Panggang suhu 180°C selama ±55 menit sampai kecokelatan.
                8. Campurkan bahan saus.
                9. Sajikan dengan saus.
            """.trimIndent(),
            imageRes = R.drawable.bebek_peking
        ),

        RecipeEntity(
            id = 2,
            title = "Roti Canai",
            tags = "oriental,malaysian,bread",
            cookingTime = "1 jam 30 menit",
            ingredients = """
                - 500 gram tepung terigu protein sedang
                - 2 butir telur
                - 200 ml susu cair hangat
                - 100 gram margarin cair
                - 6 sdm minyak goreng
                - Garam secukupnya
                - Margarin untuk olesan
            """.trimIndent(),
            steps = """
                1. Campur susu, telur, dan margarin.
                2. Masukkan tepung sedikit demi sedikit.
                3. Tambahkan garam, uleni hingga kalis.
                4. Diamkan 1 jam.
                5. Bagi adonan kecil.
                6. Pipihkan, oles margarin, gulung.
                7. Bentuk spiral, pipihkan.
                8. Panggang di teflon hingga kecokelatan.
            """.trimIndent(),
            imageRes = R.drawable.roti_canai
        ),

        RecipeEntity(
            id = 3,
            title = "Ramen",
            tags = "oriental,japanese,noodle",
            cookingTime = "30 menit",
            ingredients = """
                - Mi ramen
                - Udang kupas
                - Telur
                - Daging rebus
                - Sawi
                - Kacang polong
                - Bawang putih
                - Bawang bombay
                - Kecap ikan
                - Kaldu ayam
                - Garam dan lada
            """.trimIndent(),
            steps = """
                1. Rebus mi, tiriskan.
                2. Tumis bawang putih dan bombay.
                3. Masukkan udang.
                4. Tuang kaldu dan kecap ikan.
                5. Masukkan sawi dan kacang polong.
                6. Masukkan mi.
                7. Sajikan dengan telur dan daging.
            """.trimIndent(),
            imageRes = R.drawable.ramen
        ),

        RecipeEntity(
            id = 4,
            title = "Capcay",
            tags = "oriental,chinese,vegetable",
            cookingTime = "25 menit",
            ingredients = """
                - Wortel
                - Sawi hijau
                - Jamur tiram
                - Bawang bombay
                - Bawang putih
                - Jahe
                - Bakso sapi
                - Air
                - Garam
                - Lada
                - Minyak wijen
                - Saus tiram
            """.trimIndent(),
            steps = """
                1. Tumis bawang dan jahe.
                2. Masukkan bakso.
                3. Masukkan wortel dan air.
                4. Masukkan jamur dan sawi.
                5. Tambahkan bumbu.
                6. Masak hingga matang.
            """.trimIndent(),
            imageRes = R.drawable.capcay
        ),

        RecipeEntity(
        id = 6,
        title = "Tempura Udang",
        tags = "oriental,japanese,seafood",
        cookingTime = "35 menit",
        ingredients = """
        - 500 gram udang, bersihkan dan sisakan ekor
        - 1 buah jeruk nipis
        - Garam dan lada secukupnya
        - 2 butir telur, kocok lepas
        - 200 gram tepung terigu
        - 250 gram tepung roti
        - Minyak untuk menggoreng
    """.trimIndent(),
        steps = """
        1. Lumuri udang dengan air jeruk nipis, bilas dan tiriskan.
        2. Bumbui udang dengan garam dan lada.
        3. Gulingkan udang ke dalam tepung terigu.
        4. Celupkan ke telur kocok.
        5. Balur dengan tepung roti hingga rata.
        6. Panaskan minyak dengan api sedang.
        7. Goreng udang hingga kuning keemasan dan renyah.
        8. Angkat dan tiriskan.
    """.trimIndent(),
        imageRes = R.drawable.tempura_udang
    ),

        RecipeEntity(
        id = 7,
        title = "Kari Ayam",
        tags = "oriental,indian,chicken",
        cookingTime = "1 jam",
        ingredients = """
        - 1 ekor ayam, potong-potong
        - 2 buah kentang, potong dadu
        - 500 ml santan
        - 2 lembar daun salam
        - 1 batang serai, memarkan
        - Minyak untuk menumis

        Bumbu halus:
        - 6 siung bawang merah
        - 4 siung bawang putih
        - 2 butir kemiri
        - 1 sdt ketumbar
        - 1 ruas kunyit
        - 1 ruas jahe
        - Garam secukupnya
        """.trimIndent(),
        steps = """
        1. Haluskan semua bumbu halus.
        2. Tumis bumbu hingga harum dan matang.
        3. Masukkan daun salam dan serai.
        4. Masukkan ayam, aduk hingga berubah warna.
        5. Tuangkan santan dan masak dengan api kecil.
        6. Masukkan kentang dan lanjutkan memasak hingga ayam empuk.
        7. Koreksi rasa lalu angkat.
        """.trimIndent(),
        imageRes = R.drawable.kari_ayam
    ),

        RecipeEntity(
        id = 8,
        title = "Chicken Katsu",
        tags = "oriental,japanese,chicken",
        cookingTime = "45 menit",
        ingredients = """
        - 2 potong dada ayam fillet
        - Garam dan lada secukupnya
        - 1 butir telur
        - 100 gram tepung roti
        - Minyak untuk menggoreng

        Pelengkap:
        - Wortel rebus
        - Kentang rebus
        - Saus kari Jepang
        """.trimIndent(),
        steps = """
        1. Pipihkan dada ayam lalu bumbui dengan garam dan lada.
        2. Celupkan ayam ke telur kocok.
        3. Balur ayam dengan tepung roti hingga rata.
        4. Panaskan minyak dan goreng ayam hingga matang dan renyah.
        5. Angkat dan potong-potong.
        6. Sajikan dengan saus kari dan sayuran.
        """.trimIndent(),
        imageRes = R.drawable.chicken_katsu
    ),

        RecipeEntity(
        id = 9,
        title = "Bulgogi",
        tags = "oriental,korean,beef",
        cookingTime = "2 jam",
        ingredients = """
        - 350 gram daging sapi iris tipis
        - 3 sdm kecap asin
        - 2 sdm kecap manis
        - 1 sdm madu
        - 1 sdm minyak wijen
        - 1/2 sdt lada
        - 1 sdt wijen sangrai
        """.trimIndent(),
        steps = """
        1. Campurkan semua bumbu marinasi.
        2. Masukkan daging sapi dan aduk hingga rata.
        3. Diamkan selama minimal 2 jam di kulkas.
        4. Panaskan wajan tanpa minyak.
        5. Masak daging hingga matang dan kecokelatan.
        6. Sajikan dengan taburan wijen.
        """.trimIndent(),
        imageRes = R.drawable.bulgogi
    ),

        RecipeEntity(
        id = 10,
        title = "Sushi Alpukat",
        tags = "oriental,japanese,vegetarian",
        cookingTime = "30 menit",
        ingredients = """
        - 200 gram beras sushi
        - 1 lembar nori
        - 1 buah alpukat, iris memanjang
        - 1 buah timun, iris memanjang
        - 1 butir telur dadar
        - Cuka beras secukupnya
        """.trimIndent(),
        steps = """
        1. Masak beras hingga matang lalu dinginkan.
        2. Campurkan nasi dengan cuka beras.
        3. Letakkan nori di atas alas sushi.
        4. Ratakan nasi di atas nori.
        5. Susun alpukat, timun, dan telur.
        6. Gulung perlahan hingga padat.
        7. Potong dan sajikan.
    """.trimIndent(),
    imageRes = R.drawable.sushi_alpukat
    ),

    RecipeEntity(
    id = 11,
    title = "Gyoza",
    tags = "oriental,japanese,dumpling",
    cookingTime = "45 menit",
    ingredients = """
        - 200 gram tepung terigu protein sedang
        - 1/2 sdt garam
        - 120 ml air hangat

        Bahan isian:
        - 250 gram daging ayam cincang
        - 100 gram sawi putih, cincang halus
        - 2 batang daun bawang, iris halus
        - 2 siung bawang putih, cincang
        - 1 sdm saus tiram
        - 1 sdt kecap asin
        - 1/2 sdt lada bubuk
        - Minyak wijen secukupnya
    """.trimIndent(),
    steps = """
        1. Campurkan tepung terigu dan garam, tuangkan air hangat sedikit demi sedikit.
        2. Uleni adonan hingga kalis, tutup dan diamkan selama 30 menit.
        3. Campurkan semua bahan isian hingga tercampur rata.
        4. Pipihkan adonan kulit, beri isian di tengahnya.
        5. Lipat dan rekatkan sisi-sisinya membentuk gyoza.
        6. Panaskan sedikit minyak di wajan.
        7. Susun gyoza dan masak hingga bagian bawah kecokelatan.
        8. Tambahkan sedikit air lalu tutup wajan.
        9. Masak hingga gyoza matang dan air habis.
    """.trimIndent(),
    imageRes = R.drawable.gyoza
    ),

    RecipeEntity(
    id = 12,
    title = "Bakpao Isi Daging",
    tags = "oriental,chinese,bread",
    cookingTime = "2 jam",
    ingredients = """
        Bahan kulit:
        - 500 gram tepung terigu protein rendah
        - 1 sachet ragi instan
        - 100 gram gula pasir
        - 250 ml air hangat
        - 50 gram mentega putih
        - 1/2 sdt baking powder

        Bahan isian:
        - 250 gram daging ayam/sapi cincang
        - 1/2 bawang bombay, cincang
        - 2 siung bawang putih, cincang
        - 2 sdm kecap manis
        - 1 sdm saus tiram
        - Garam dan lada secukupnya
    """.trimIndent(),
    steps = """
        1. Campurkan ragi, gula, dan air hangat, diamkan hingga berbuih.
        2. Masukkan tepung terigu dan mentega, uleni hingga kalis.
        3. Tambahkan baking powder, uleni kembali.
        4. Diamkan adonan hingga mengembang dua kali lipat.
        5. Tumis bawang bombay dan bawang putih hingga harum.
        6. Masukkan daging cincang dan bumbu, masak hingga matang.
        7. Bagi adonan kulit, pipihkan dan beri isian.
        8. Tutup rapat dan diamkan 15 menit.
        9. Kukus bakpao selama 15 menit hingga matang.
    """.trimIndent(),
    imageRes = R.drawable.bakpao
    ),

    RecipeEntity(
    id = 13,
    title = "Dimsum Ayam",
    tags = "oriental,chinese,dumpling",
    cookingTime = "1 jam",
    ingredients = """
        - 250 gram ayam fillet, haluskan
        - 50 gram tepung tapioka
        - 1 buah wortel, serut halus
        - 2 batang daun bawang, iris halus
        - 2 siung bawang putih, cincang
        - 1 sdm saus tiram
        - 1 sdt kecap asin
        - Garam dan lada secukupnya
        - Kulit pangsit secukupnya
    """.trimIndent(),
    steps = """
        1. Campurkan ayam halus, tepung tapioka, wortel, dan daun bawang.
        2. Tambahkan bawang putih, saus tiram, kecap asin, garam, dan lada.
        3. Aduk adonan hingga benar-benar tercampur.
        4. Ambil kulit pangsit, beri adonan di tengah.
        5. Bentuk sesuai selera.
        6. Panaskan kukusan dan alasi dengan daun pisang.
        7. Kukus dimsum selama 30 menit hingga matang.
    """.trimIndent(),
    imageRes = R.drawable.dimsum
    ),

    RecipeEntity(
    id = 14,
    title = "Rendang",
    tags = "oriental,indonesian,beef",
    cookingTime = "3 jam",
    ingredients = """
        - 1 kg daging sapi, potong-potong
        - 1 liter santan kental
        - 2 batang serai, memarkan
        - 4 lembar daun jeruk
        - 2 lembar daun salam
        - Minyak secukupnya

        Bumbu halus:
        - 10 siung bawang merah
        - 6 siung bawang putih
        - 5 buah cabai merah
        - 3 butir kemiri
        - 1 ruas jahe
        - 1 ruas lengkuas
        - 1 ruas kunyit
        - Garam secukupnya
    """.trimIndent(),
    steps = """
        1. Haluskan semua bumbu halus.
        2. Tumis bumbu hingga harum dan matang.
        3. Masukkan serai, daun jeruk, dan daun salam.
        4. Masukkan daging sapi, aduk hingga berubah warna.
        5. Tuangkan santan, masak dengan api kecil.
        6. Aduk sesekali agar santan tidak pecah.
        7. Masak hingga santan menyusut dan bumbu meresap.
        8. Masak sampai rendang berwarna gelap dan berminyak.
    """.trimIndent(),
    imageRes = R.drawable.rendang
    ),

    RecipeEntity(
    id = 15,
    title = "Nasi Ayam Hainan",
    tags = "oriental,chinese,rice",
    cookingTime = "1 jam",
    ingredients = """
        - 1 ekor ayam utuh
        - 2 ruas jahe, memarkan
        - 3 siung bawang putih
        - Garam secukupnya
        - Minyak wijen secukupnya

        Bahan saus jahe:
        - 2 ruas jahe, parut
        - 3 sdm minyak panas
        - Garam secukupnya
    """.trimIndent(),
    steps = """
        1. Lumuri ayam dengan garam.
        2. Rebus ayam bersama jahe dan bawang putih hingga matang.
        3. Angkat ayam, lumuri dengan minyak wijen.
        4. Masak nasi menggunakan air rebusan ayam.
        5. Campur bahan saus jahe.
        6. Sajikan ayam dengan nasi dan saus jahe.
    """.trimIndent(),
    imageRes = R.drawable.nasi_ayam_hainan
    ),

    RecipeEntity(
    id = 16,
    title = "Pad Thai",
    tags = "oriental,thai,noodle",
    cookingTime = "35 menit",
    ingredients = """
        - 200 gram mie beras, rendam air hangat
        - 150 gram dada ayam, iris tipis
        - 2 butir telur
        - 100 gram tauge
        - 2 siung bawang putih, cincang
        - Minyak untuk menumis

        Bahan saus:
        - 2 sdm kecap ikan
        - 1 sdm saus tiram
        - 1 sdm gula merah
        - 1 sdm air asam jawa
    """.trimIndent(),
    steps = """
        1. Panaskan minyak, tumis bawang putih hingga harum.
        2. Masukkan ayam, masak hingga matang.
        3. Geser ayam, masukkan telur, orak-arik.
        4. Masukkan mie beras dan bahan saus.
        5. Aduk hingga mie matang dan bumbu meresap.
        6. Masukkan tauge, aduk sebentar lalu angkat.
    """.trimIndent(),
    imageRes = R.drawable.pad_thai
    ),

    RecipeEntity(
    id = 17,
    title = "Hokkien Prawn Mee",
    tags = "oriental,malaysian,noodle",
    cookingTime = "45 menit",
    ingredients = """
        - 200 gram mi hokkien
        - 150 gram udang, kupas
        - 100 gram kerang hijau
        - 2 siung bawang putih, cincang
        - 2 butir telur
        - 500 ml kaldu udang
        - 2 sdm saus tiram
        - 1 sdt kecap asin
        - Minyak untuk menumis
    """.trimIndent(),
    steps = """
        1. Panaskan minyak, tumis bawang putih hingga harum.
        2. Masukkan telur, orak-arik hingga setengah matang.
        3. Tuang kaldu udang dan biarkan mendidih.
        4. Masukkan udang dan kerang hijau.
        5. Tambahkan saus tiram dan kecap asin.
        6. Masukkan mi hokkien, masak hingga kuah menyusut.
        7. Angkat dan sajikan hangat.
    """.trimIndent(),
    imageRes = R.drawable.hokkien_prawn_mee
    ),

    RecipeEntity(
    id = 18,
    title = "Nasi Briyani",
    tags = "oriental,indian,rice",
    cookingTime = "1 jam 30 menit",
    ingredients = """
        - 500 gram beras basmati, cuci dan rendam 30 menit
        - 500 gram daging ayam atau kambing
        - 1 buah bawang bombay, iris tipis
        - 3 siung bawang putih, cincang
        - 2 buah tomat, cincang
        - 200 ml yoghurt
        - 700 ml air
        - 3 sdm minyak samin atau minyak goreng

        Bumbu rempah:
        - 3 buah kapulaga
        - 3 butir cengkeh
        - 1 batang kayu manis
        - 1 sdt jintan
        - 1 sdt ketumbar
        - Garam secukupnya
    """.trimIndent(),
    steps = """
        1. Panaskan minyak samin di dalam panci.
        2. Tumis bawang bombay hingga harum dan kecokelatan.
        3. Masukkan bawang putih dan tomat, masak hingga layu.
        4. Masukkan daging, aduk hingga berubah warna.
        5. Masukkan yoghurt dan semua bumbu rempah.
        6. Aduk hingga bumbu meresap dan daging setengah empuk.
        7. Masukkan beras basmati dan air.
        8. Masak dengan api kecil hingga air menyusut dan nasi matang.
        9. Angkat dan sajikan hangat.
    """.trimIndent(),
    imageRes = R.drawable.nasi_briyani
    ),

    RecipeEntity(
    id = 19,
    title = "Kimchi",
    tags = "oriental,korean,fermented",
    cookingTime = "3 hari",
    ingredients = """
        - 1 kg sawi putih, potong besar
        - 100 gram garam kasar
        - 1 liter air

        Bahan pasta kimchi:
        - 5 siung bawang putih
        - 1 ruas jahe
        - 1 buah apel
        - 3 sdm kecap ikan
        - 2 sdm bubuk cabai Korea
        - 2 sdm tepung beras
        - 200 ml air
        - 2 batang daun bawang, iris
        - 1 buah wortel, iris korek api
    """.trimIndent(),
    steps = """
        1. Larutkan garam dalam air, rendam sawi selama 6 jam.
        2. Bilas sawi hingga bersih lalu tiriskan.
        3. Masak tepung beras dengan air hingga menjadi bubur, dinginkan.
        4. Haluskan bawang putih, jahe, dan apel.
        5. Campurkan bumbu halus, bubur beras, kecap ikan, dan bubuk cabai.
        6. Masukkan wortel dan daun bawang ke dalam pasta kimchi.
        7. Lumuri sawi dengan pasta kimchi hingga merata.
        8. Simpan dalam wadah tertutup.
        9. Fermentasi selama 2–3 hari pada suhu ruang.
    """.trimIndent(),
    imageRes = R.drawable.kimchi
    ),

        RecipeEntity(
            id = 20,
            title = "Kebab",
            tags = "oriental,middleeastern,meat",
            cookingTime = "1 jam",
            ingredients = """
                - Daging sapi cincang
                - Bawang bombay
                - Bawang putih
                - Ketumbar
                - Jintan
                - Garam dan lada
                - Tepung terigu
                - Air hangat
                - Selada, tomat, timun
                - Saus kebab
            """.trimIndent(),
            steps = """
                1. Buat adonan kulit dan diamkan.
                2. Campur bahan daging.
                3. Masak daging hingga matang.
                4. Panggang kulit kebab.
                5. Isi dengan daging dan sayuran.
                6. Gulung dan sajikan.
            """.trimIndent(),
            imageRes = R.drawable.kebab
        )
    )
}
