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
package com.example.androiddevchallenge.data

import android.os.Parcel
import android.os.Parcelable
import com.example.androiddevchallenge.R

data class Dog(
    val animalId: String,
    val intakeType: String,
    val inDate: String,
    val name: String,
    val type: String,
    val age: String,
    val size: String,
    val breed: String,
    val sex: String,
    val link: String,
    val crossing: String,
    val color: String,
    val resId: Int = R.drawable.dog_default,
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(animalId)
        parcel.writeString(intakeType)
        parcel.writeString(inDate)
        parcel.writeString(name)
        parcel.writeString(type)
        parcel.writeString(age)
        parcel.writeString(size)
        parcel.writeString(breed)
        parcel.writeString(sex)
        parcel.writeString(link)
        parcel.writeString(crossing)
        parcel.writeString(color)
        parcel.writeInt(resId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Dog> {
        override fun createFromParcel(parcel: Parcel): Dog {
            return Dog(parcel)
        }

        override fun newArray(size: Int): Array<Dog?> {
            return arrayOfNulls(size)
        }
    }
}
