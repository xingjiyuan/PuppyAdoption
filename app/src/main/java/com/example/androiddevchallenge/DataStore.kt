/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.androiddevchallenge.data.Dog

/**
 *
 *
 */
class DataStore {
    val dogs by mutableStateOf(
        listOf(
            Dog(
                "A433740",
                "RETURN",
                "03/12/2018",
                "*REBEL",
                "DOG",
                "2 YEARS",
                "LARGE",
                "AM PIT BULL TER",
                "S",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A433740&location=MONT",
                "",
                "WHITE / BROWN",
                R.drawable.dog1
            ),
            Dog(
                "A433407",
                "STRAY",
                "12/26/2017",
                "*SCOOBY",
                "DOG",
                "7 YEARS",
                "LARGE",
                "AM PIT BULL TER",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A433407&location=MONT",
                "1500 AITCHESON LN, LAUREL MD 20707",
                "BEIGE", R.drawable.dog2
            ),
            Dog(
                "A436548",
                "STRAY",
                "04/09/2018",
                "BABY",
                "DOG",
                "9 YEARS",
                "LARGE",
                "MASTIFF",
                "S",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A436548&location=MONT",
                "900 CHESLEY KNOLL CT, GAITHERSBURG MD 20879",
                "BRINDLE", R.drawable.dog3
            ),
            Dog(
                "A386892",
                "FOSTER",
                "05/24/2018",
                "TONKA",
                "DOG",
                "4 YEARS",
                "LARGE",
                "POINTER / MIX",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A386892&location=MONT",
                "",
                "WHITE / BLACK", R.drawable.dog6
            ),
            Dog(
                "A436401",
                "OWNER SUR",
                "04/05/2018",
                "BISON",
                "DOG",
                "2 YEARS",
                "MED",
                "AM PIT BULL TER",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A436401&location=MONT",
                "",
                "WHITE / GRAY", R.drawable.dog5

            ),
            Dog(
                "A434478",
                "OWNER SUR",
                "02/01/2018",
                "NICO",
                "DOG",
                "8 YEARS",
                "LARGE",
                "AM PIT BULL TER",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A434478&location=MONT",
                "",
                "TAN", R.drawable.dog7

            ),
            Dog(
                "A438690",
                "STRAY",
                "06/04/2018",
                "*BOU",
                "DOG",
                "8 YEARS",
                "MED",
                "LABRADOR RETR / MIX",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A438690&location=MONT",
                "ROCKVILLE PIKE & BOU AVE, ROCKVILLE MD 20852",
                "BLACK", R.drawable.dog8

            ),
            Dog(
                "A438599",
                "STRAY",
                "06/02/2018",
                "*RAVI",
                "DOG",
                "5 YEARS",
                "MED",
                "AM PIT BULL TER",
                "S",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A438599&location=MONT",
                "0 OSWEGO AVE, SILVER SPRING MD 20910",
                "WHITE / BROWN", R.drawable.dog9

            ),
            Dog(
                "A406631",
                "STRAY",
                "06/18/2018",
                "FRISKY",
                "DOG",
                "5 YEARS",
                "SMALL",
                "JACK RUSS TERR / RAT TERRIER",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A406631&location=MONT",
                "23600 ROLLING FORK WAY, GAITHERSBURG MD 20882",
                "BLACK / WHITE", R.drawable.dog10

            ),
            Dog(
                "A439234",
                "STRAY",
                "06/19/2018",
                "DOG",
                "DOG",
                "NO AGE",
                "MED",
                "POODLE STND",
                "M",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A439234&location=MONT",
                "CONNECTICUT AVE AND EAST WEST HWY,CHEVY CHASE MD",
                "BLACK"
            ),
            Dog(
                "A426407",
                "CONFISCATE",
                "06/28/2017",
                "CALYPSO",
                "DOG",
                "7 YEARS",
                "LARGE",
                "AM PIT BULL TER",
                "S",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A426407&location=MONT",
                "",
                "BRINDLE / BROWN"
            ),
            Dog(
                "A438816",
                "OWNER SUR",
                "06/08/2018",
                "REESE",
                "DOG",
                "2 YEARS",
                "MED",
                "AM PIT BULL TER",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A438816&location=MONT",
                "",
                "BROWN"
            ),
            Dog(
                "A435248",
                "OWNER SUR",
                "02/27/2018",
                "CHICO",
                "DOG",
                "5 YEARS",
                "LARGE",
                "GERM SHEPHERD",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A435248&location=MONT",
                "",
                "TAN / BLACK"
            ),
            Dog(
                "A438918",
                "STRAY",
                "06/11/2018",
                "SADIE",
                "DOG",
                "3 YEARS",
                "LARGE",
                "AM PIT BULL TER",
                "S",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A438918&location=MONT",
                "9800 CONNECTICUT AVE, KENSINGTON MD 20895",
                "WHITE / BLACK"
            ),
            Dog(
                "A427258",
                "OWNER SUR",
                "07/03/2018",
                "MAX",
                "DOG",
                "11 YEARS",
                "SMALL",
                "CHIHUAHUA SH / MIX",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A427258&location=MONT",
                "",
                "TAN"
            ),
            Dog(
                "A439591",
                "STRAY",
                "06/26/2018",
                "*NATE",
                "DOG",
                "2 YEARS",
                "LARGE",
                "CHINESE SHARPEI / BULLMASTIFF",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A439591&location=MONT",
                "900 NORTHAMPTON DR, SILVER SPRING MD 20903",
                "BROWN"
            ),
            Dog(
                "A439590",
                "STRAY",
                "06/26/2018",
                "*NATHAN",
                "DOG",
                "5 YEARS",
                "LARGE",
                "CHINESE SHARPEI / BULLMASTIFF",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A439590&location=MONT",
                "900 NORTHAMPTON DR, SILVER SPRING MD 20903",
                "BROWN"
            ),
            Dog(
                "A832792",
                "OWNER SUR",
                "07/16/2018",
                "LUCKY",
                "DOG",
                "9 YEARS",
                "MED",
                "AM PIT BULL TER",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A832792&location=MONT",
                "",
                "WHITE / BROWN"
            ),
            Dog(
                "A370405",
                "OWNER SUR",
                "05/08/2018",
                "ROCKO",
                "DOG",
                "8 YEARS",
                "LARGE",
                "STAFFORDSHIRE",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A370405&location=MONT",
                "",
                "BROWN / WHITE"
            ),
            Dog(
                "A440758",
                "OWNER SUR",
                "07/24/2018",
                "CHICA",
                "DOG",
                "13 YEARS",
                "SMALL",
                "CHIHUAHUA SH",
                "F",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A440758&location=MONT",
                "",
                "TAN"
            ),
            Dog(
                "A435403",
                "RETURN",
                "03/17/2018",
                "WILLOW",
                "DOG",
                "1 YEAR 5 MONTHS",
                "MED",
                "AM PIT BULL TER",
                "S",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A435403&location=MONT",
                "",
                "BLUE"
            ),
            Dog(
                "A434836",
                "OWNER SUR",
                "05/23/2018",
                "TYSON",
                "DOG",
                "1 YEAR 5 MONTHS",
                "X-LRG",
                "BOERBOEL / MIX",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A434836&location=MONT",
                "",
                "TAN"
            ),
            Dog(
                "A437176",
                "STRAY",
                "04/26/2018",
                "*SHERMAN",
                "DOG",
                "1 YEAR 4 MONTHS",
                "LARGE",
                "AM PIT BULL TER",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A437176&location=MONT",
                "400 CHRISTOPHER AVE, GAITHERSBURG MD 20879",
                "BROWN"
            ),
            Dog(
                "A354709",
                "STRAY",
                "07/15/2018",
                "*KIELBASA",
                "DOG",
                "5 YEARS",
                "LARGE",
                "AM PIT BULL TER",
                "S",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A354709&location=MONT",
                "0 FREDERICK RD, ROCKVILLE MD 20850",
                "BLUE / WHITE"
            ),
            Dog(
                "A440750",
                "STRAY",
                "07/24/2018",
                "*KIKI",
                "DOG",
                "2 YEARS",
                "LARGE",
                "ROTTWEILER",
                "F",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A440750&location=MONT",
                "14100 CASTLE BLVD, SILVER SPRING MD 20904",
                "BLACK / BROWN"
            ),
            Dog(
                "A441041",
                "OWNER SUR",
                "07/30/2018",
                "NUBIAN",
                "DOG",
                "7 MONTHS",
                "MED",
                "AM PIT BULL TER",
                "F",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A441041&location=MONT",
                "",
                "BROWN / WHITE"
            ),
            Dog(
                "A439017",
                "STRAY",
                "06/14/2018",
                "*JUBILEE",
                "DOG",
                "1 YEAR 1 MONTH",
                "MED",
                "AM PIT BULL TER",
                "S",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A439017&location=MONT",
                "11200 OAK LEAF DR, SILVER SPRING MD 20901",
                "GRAY"
            ),
            Dog(
                "A440061",
                "OWNER SUR",
                "07/09/2018",
                "JR",
                "DOG",
                "1 YEAR 7 MONTHS",
                "MED",
                "TR WALKER HOUND",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A440061&location=MONT",
                "",
                "WHITE / BRINDLE"
            ),
            Dog(
                "A434081",
                "RETURN",
                "03/17/2018",
                "BENTLEY",
                "DOG",
                "1 YEAR 7 MONTHS",
                "LARGE",
                "AM PIT BULL TER / GERM SHEPHERD",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A434081&location=MONT",
                "",
                "BLACK / WHITE"
            ),
            Dog(
                "A439180",
                "STRAY",
                "06/18/2018",
                "HONEY",
                "DOG",
                "1 YEAR 8 MONTHS",
                "SMALL",
                "AM PIT BULL TER",
                "F",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A439180&location=MONT",
                "16200 FREDERICK RD, GAITHERSBURG MD 20877",
                "BLACK"
            ),
            Dog(
                "A438938",
                "OWNER SUR",
                "06/12/2018",
                "DRE",
                "DOG",
                "10 MONTHS",
                "MED",
                "BOXER / GERM SHEPHERD",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A438938&location=MONT",
                "",
                "BRINDLE"
            ),
            Dog(
                "A439583",
                "RETURN",
                "07/13/2018",
                "*TUK",
                "DOG",
                "1 YEAR 2 MONTHS",
                "LARGE",
                "ALASKAN HUSKY / GERM SHEPHERD",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A439583&location=MONT",
                "",
                "BLACK / WHITE"
            ),
            Dog(
                "A426564",
                "FOSTER",
                "07/23/2018",
                "RYUU",
                "DOG",
                "2 YEARS",
                "LARGE",
                "AM PIT BULL TER",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A426564&location=MONT",
                "",
                "BRINDLE"
            ),
            Dog(
                "A436851",
                "STRAY",
                "04/16/2018",
                "*BROOKE",
                "DOG",
                "1 YEAR 4 MONTHS",
                "LARGE",
                "PRESA CANARIO / MIX",
                "S",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A436851&location=MONT",
                "6700 GLEN OAK CT, DERWOOD MD 20855",
                "BRINDLE / WHITE"
            ),
            Dog(
                "A431177",
                "OWNER SUR",
                "03/13/2018",
                "ROCKY",
                "DOG",
                "1 YEAR 9 MONTHS",
                "LARGE",
                "AM PIT BULL TER",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A431177&location=MONT",
                "",
                "BROWN / WHITE"
            ),
            Dog(
                "A436668",
                "OWNER SUR",
                "04/12/2018",
                "KATO",
                "DOG",
                "1 YEAR 9 MONTHS",
                "MED",
                "STAFFORDSHIRE",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A436668&location=MONT",
                "",
                "BRINDLE / WHITE"
            ),
            Dog(
                "A434983",
                "OWNER SUR",
                "02/18/2018",
                "LILY",
                "DOG",
                "3 YEARS",
                "MED",
                "LABRADOR RETR / AM PIT BULL TER",
                "S",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A434983&location=MONT",
                "",
                "BLACK / WHITE"
            ),
            Dog(
                "A440512",
                "STRAY",
                "07/17/2018",
                "*PETER",
                "DOG",
                "2 YEARS",
                "MED",
                "TIBETAN TERR / MIX",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A440512&location=MONT",
                "9500 CENTERWAY RD, MONTGOMERY VILLAGE MD 20886",
                "WHITE / TAN"
            ),
            Dog(
                "A440694",
                "STRAY",
                "07/22/2018",
                "*CARLA",
                "DOG",
                "5 YEARS",
                "SMALL",
                "PUG / BEAGLE",
                "S",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A440694&location=MONT",
                "9300 CORPORATE BLVD, ROCKVILLE MD 20850",
                "TAN"
            ),
            Dog(
                "A438368",
                "CONFISCATE",
                "07/10/2018",
                "MAMA",
                "DOG",
                "2 YEARS",
                "SMALL",
                "AMERICAN STAFF / BASENJI",
                "F",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A438368&location=MONT",
                "",
                "BLACK / WHITE"
            ),
            Dog(
                "A430973",
                "OWNER SUR",
                "07/12/2018",
                "DOGOL",
                "DOG",
                "1 YEAR 4 MONTHS",
                "MED",
                "CANAAN DOG / CATAHOULA",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A430973&location=MONT",
                "",
                "GRAY"
            ),
            Dog(
                "A440423",
                "STRAY",
                "07/15/2018",
                "*HONEY",
                "DOG",
                "2 YEARS",
                "SMALL",
                "JACK RUSS TERR",
                "F",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A440423&location=MONT",
                "12100 TRAILRIDGE DR, POTOMAC MD 20854",
                "TAN"
            ),
            Dog(
                "A440275",
                "OWNER SUR",
                "07/14/2018",
                "WINKLES",
                "DOG",
                "10 MONTHS",
                "LARGE",
                "MASTIFF / CHINESE SHARPEI",
                "N",
                "http://www.petharbor.com/get_image.asp?res=DETAIL&id=A440275&location=MONT",
                "",
                "CHESTNUT"
            ),
        )
    )

    var currentDog: Dog? by mutableStateOf(null)

    fun showDog(dog: Dog) {
        currentDog = dog
    }

    fun closeDog() {
        currentDog = null
    }
}
