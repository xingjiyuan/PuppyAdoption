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
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun DogList(dogs: List<Dog>, onDogClick: (Dog) -> Unit = {}) {
    LazyColumn(
        Modifier.background(MaterialTheme.colors.background),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dogs) { dog ->
            DogItem(
                dog,
                Modifier
                    .clickable {
                        onDogClick(dog)
                    }
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
fun DogItem(dog: Dog, modifier: Modifier = Modifier) {
    Card(modifier.padding(horizontal = 12.dp, vertical = 4.dp), elevation = 8.dp) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painterResource(dog.resId),
                "Picture of ${dog.name}",
                Modifier.size(120.dp),
                contentScale = ContentScale.Crop
            )
            Column(Modifier.padding(12.dp)) {
                Text(dog.name, style = MaterialTheme.typography.h6)
                Text("${dog.sex} / ${dog.size} / ${dog.age}")
                Text(dog.crossing)
            }
        }
    }
}

@Preview
@Composable
fun DogListPreview() {
    val dogs = listOf(
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
            "BEIGE",
            R.drawable.dog_default
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
            "BRINDLE",
            R.drawable.dog10
        ),
    )
    MyTheme {
        DogList(dogs)
    }
}

@Preview
@Composable
fun DogListPreviewDark() {
    val dogs = listOf(
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
            "WHITE / BROWN"
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
            "BEIGE"
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
            "BRINDLE"
        ),
    )
    MyTheme(darkTheme = true) {
        DogList(dogs)
    }
}

@Preview
@Composable
fun DogItemPreview() {
    MyTheme {
        DogItem(
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
                "BRINDLE"
            )
        )
    }
}

@Preview
@Composable
fun DogItemPreviewDark() {
    MyTheme(darkTheme = true) {
        DogItem(
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
                "BRINDLE"
            )
        )
    }
}
