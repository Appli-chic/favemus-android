package com.applichic.favemus.dialog

import android.content.Context


class Country(val code: String, val name: String) {

    companion object {
        fun getCountries(): List<Country>? {
            val countries: MutableList<Country> = ArrayList()
            countries.add(Country("ad", "Andorra"))
            countries.add(Country("ae", "United Arab Emirates (UAE)"))
            countries.add(Country("af", "Afghanistan"))
            countries.add(Country("ag", "Antigua and Barbuda"))
            countries.add(Country("ai", "Anguilla"))
            countries.add(Country("al", "Albania"))
            countries.add(Country("am", "Armenia"))
            countries.add(Country("ao", "Angola"))
            countries.add(Country("aq", "Antarctica"))
            countries.add(Country("ar", "Argentina"))
            countries.add(Country("as", "American Samoa"))
            countries.add(Country("at", "Austria"))
            countries.add(Country("au", "Australia"))
            countries.add(Country("aw", "Aruba"))
            countries.add(Country("ax", "Åland Islands"))
            countries.add(Country("az", "Azerbaijan"))
            countries.add(Country("ba", "Bosnia And Herzegovina"))
            countries.add(Country("bb", "Barbados"))
            countries.add(Country("bd", "Bangladesh"))
            countries.add(Country("be", "Belgium"))
            countries.add(Country("bf", "Burkina Faso"))
            countries.add(Country("bg", "Bulgaria"))
            countries.add(Country("bh", "Bahrain"))
            countries.add(Country("bi", "Burundi"))
            countries.add(Country("bj", "Benin"))
            countries.add(Country("bl", "Saint Barthélemy"))
            countries.add(Country("bm", "Bermuda"))
            countries.add(Country("bn", "Brunei Darussalam"))
            countries.add(Country("bo", "Bolivia, Plurinational State Of"))
            countries.add(Country("br", "Brazil"))
            countries.add(Country("bs", "Bahamas"))
            countries.add(Country("bt", "Bhutan"))
            countries.add(Country("bw", "Botswana"))
            countries.add(Country("by", "Belarus"))
            countries.add(Country("bz", "Belize"))
            countries.add(Country("ca", "Canada"))
            countries.add(Country("cc", "Cocos (keeling) Islands"))
            countries.add(
                Country(
                    "cd",
                    "Congo, The Democratic Republic Of The"
                )
            )
            countries.add(Country("cf", "Central African Republic"))
            countries.add(Country("cg", "Congo"))
            countries.add(Country("ch", "Switzerland"))
            countries.add(Country("ci", "Côte D'ivoire"))
            countries.add(Country("ck", "Cook Islands"))
            countries.add(Country("cl", "Chile"))
            countries.add(Country("cm", "Cameroon"))
            countries.add(Country("cn", "China"))
            countries.add(Country("co", "Colombia"))
            countries.add(Country("cr", "Costa Rica"))
            countries.add(Country("cu", "Cuba"))
            countries.add(Country("cv", "Cape Verde"))
            countries.add(Country("cw", "Curaçao"))
            countries.add(Country("cx", "Christmas Island"))
            countries.add(Country("cy", "Cyprus"))
            countries.add(Country("cz", "Czech Republic"))
            countries.add(Country("de", "Germany"))
            countries.add(Country("dj", "Djibouti"))
            countries.add(Country("dk", "Denmark"))
            countries.add(Country("dm", "Dominica"))
            countries.add(Country("do", "Dominican Republic"))
            countries.add(Country("dz", "Algeria"))
            countries.add(Country("ec", "Ecuador"))
            countries.add(Country("ee", "Estonia"))
            countries.add(Country("eg", "Egypt"))
            countries.add(Country("er", "Eritrea"))
            countries.add(Country("es", "Spain"))
            countries.add(Country("et", "Ethiopia"))
            countries.add(Country("fi", "Finland"))
            countries.add(Country("fj", "Fiji"))
            countries.add(Country("fk", "Falkland Islands (malvinas)"))
            countries.add(Country("fm", "Micronesia, Federated States Of"))
            countries.add(Country("fo", "Faroe Islands"))
            countries.add(Country("fr", "France"))
            countries.add(Country("ga", "Gabon"))
            countries.add(Country("gb", "United Kingdom"))
            countries.add(Country("gd", "Grenada"))
            countries.add(Country("ge", "Georgia"))
            countries.add(Country("gf", "French Guyana"))
            countries.add(Country("gh", "Ghana"))
            countries.add(Country("gi", "Gibraltar"))
            countries.add(Country("gl", "Greenland"))
            countries.add(Country("gm", "Gambia"))
            countries.add(Country("gn", "Guinea"))
            countries.add(Country("gp", "Guadeloupe"))
            countries.add(Country("gq", "Equatorial Guinea"))
            countries.add(Country("gr", "Greece"))
            countries.add(Country("gt", "Guatemala"))
            countries.add(Country("gu", "Guam"))
            countries.add(Country("gw", "Guinea-bissau"))
            countries.add(Country("gy", "Guyana"))
            countries.add(Country("hk", "Hong Kong"))
            countries.add(Country("hn", "Honduras"))
            countries.add(Country("hr", "Croatia"))
            countries.add(Country("ht", "Haiti"))
            countries.add(Country("hu", "Hungary"))
            countries.add(Country("id", "Indonesia"))
            countries.add(Country("ie", "Ireland"))
            countries.add(Country("il", "Israel"))
            countries.add(Country("im", "Isle Of Man"))
            countries.add(Country("is", "Iceland"))
            countries.add(Country("in", "India"))
            countries.add(Country("io", "British Indian Ocean Territory"))
            countries.add(Country("iq", "Iraq"))
            countries.add(Country("ir", "Iran, Islamic Republic Of"))
            countries.add(Country("it", "Italy"))
            countries.add(Country("je", "Jersey "))
            countries.add(Country("jm", "Jamaica"))
            countries.add(Country("jo", "Jordan"))
            countries.add(Country("jp", "Japan"))
            countries.add(Country("ke", "Kenya"))
            countries.add(Country("kg", "Kyrgyzstan"))
            countries.add(Country("kh", "Cambodia"))
            countries.add(Country("ki", "Kiribati"))
            countries.add(Country("km", "Comoros"))
            countries.add(Country("kn", "Saint Kitts and Nevis"))
            countries.add(Country("kp", "North Korea"))
            countries.add(Country("kr", "South Korea"))
            countries.add(Country("kw", "Kuwait"))
            countries.add(Country("ky", "Cayman Islands"))
            countries.add(Country("kz", "Kazakhstan"))
            countries.add(Country("la", "Lao People's Democratic Republic"))
            countries.add(Country("lb", "Lebanon"))
            countries.add(Country("lc", "Saint Lucia"))
            countries.add(Country("li", "Liechtenstein"))
            countries.add(Country("lk", "Sri Lanka"))
            countries.add(Country("lr", "Liberia"))
            countries.add(Country("ls", "Lesotho"))
            countries.add(Country("lt", "Lithuania"))
            countries.add(Country("lu", "Luxembourg"))
            countries.add(Country("lv", "Latvia"))
            countries.add(Country("ly", "Libya"))
            countries.add(Country("ma", "Morocco"))
            countries.add(Country("mc", "Monaco"))
            countries.add(Country("md", "Moldova, Republic Of"))
            countries.add(Country("me", "Montenegro"))
            countries.add(Country("mf", "Saint Martin"))
            countries.add(Country("mg", "Madagascar"))
            countries.add(Country("mh", "Marshall Islands"))
            countries.add(Country("mk", "Macedonia (FYROM)"))
            countries.add(Country("ml", "Mali"))
            countries.add(Country("mm", "Myanmar"))
            countries.add(Country("mn", "Mongolia"))
            countries.add(Country("mo", "Macau"))
            countries.add(Country("mp", "Northern Mariana Islands"))
            countries.add(Country("mq", "Martinique"))
            countries.add(Country("mr", "Mauritania"))
            countries.add(Country("ms", "Montserrat"))
            countries.add(Country("mt", "Malta"))
            countries.add(Country("mu", "Mauritius"))
            countries.add(Country("mv", "Maldives"))
            countries.add(Country("mw", "Malawi"))
            countries.add(Country("mx", "Mexico"))
            countries.add(Country("my", "Malaysia"))
            countries.add(Country("mz", "Mozambique"))
            countries.add(Country("na", "Namibia"))
            countries.add(Country("nc", "New Caledonia"))
            countries.add(Country("ne", "Niger"))
            countries.add(Country("nf", "Norfolk Islands"))
            countries.add(Country("ng", "Nigeria"))
            countries.add(Country("ni", "Nicaragua"))
            countries.add(Country("nl", "Netherlands"))
            countries.add(Country("no", "Norway"))
            countries.add(Country("np", "Nepal"))
            countries.add(Country("nr", "Nauru"))
            countries.add(Country("nu", "Niue"))
            countries.add(Country("nz", "New Zealand"))
            countries.add(Country("om", "Oman"))
            countries.add(Country("pa", "Panama"))
            countries.add(Country("pe", "Peru"))
            countries.add(Country("pf", "French Polynesia"))
            countries.add(Country("pg", "Papua New Guinea"))
            countries.add(Country("ph", "Philippines"))
            countries.add(Country("pk", "Pakistan"))
            countries.add(Country("pl", "Poland"))
            countries.add(Country("pm", "Saint Pierre And Miquelon"))
            countries.add(Country("pn", "Pitcairn Islands"))
            countries.add(Country("pr", "Puerto Rico"))
            countries.add(Country("ps", "Palestine"))
            countries.add(Country("pt", "Portugal"))
            countries.add(Country("pw", "Palau"))
            countries.add(Country("py", "Paraguay"))
            countries.add(Country("qa", "Qatar"))
            countries.add(Country("re", "Réunion"))
            countries.add(Country("ro", "Romania"))
            countries.add(Country("rs", "Serbia"))
            countries.add(Country("ru", "Russian Federation"))
            countries.add(Country("rw", "Rwanda"))
            countries.add(Country("sa", "Saudi Arabia"))
            countries.add(Country("sb", "Solomon Islands"))
            countries.add(Country("sc", "Seychelles"))
            countries.add(Country("sd", "Sudan"))
            countries.add(Country("se", "Sweden"))
            countries.add(Country("sg", "Singapore"))
            countries.add(
                Country(
                    "sh",
                    "Saint Helena, Ascension And Tristan Da Cunha"
                )
            )
            countries.add(Country("si", "Slovenia"))
            countries.add(Country("sk", "Slovakia"))
            countries.add(Country("sl", "Sierra Leone"))
            countries.add(Country("sm", "San Marino"))
            countries.add(Country("sn", "Senegal"))
            countries.add(Country("so", "Somalia"))
            countries.add(Country("sr", "Suriname"))
            countries.add(Country("ss", "South Sudan"))
            countries.add(Country("st", "Sao Tome And Principe"))
            countries.add(Country("sv", "El Salvador"))
            countries.add(Country("sx", "Sint Maarten"))
            countries.add(Country("sy", "Syrian Arab Republic"))
            countries.add(Country("sz", "Swaziland"))
            countries.add(Country("tc", "Turks and Caicos Islands"))
            countries.add(Country("td", "Chad"))
            countries.add(Country("tg", "Togo"))
            countries.add(Country("th", "Thailand"))
            countries.add(Country("tj", "Tajikistan"))
            countries.add(Country("tk", "Tokelau"))
            countries.add(Country("tl", "Timor-leste"))
            countries.add(Country("tm", "Turkmenistan"))
            countries.add(Country("tn", "Tunisia"))
            countries.add(Country("to", "Tonga"))
            countries.add(Country("tr", "Turkey"))
            countries.add(Country("tt", "Trinidad &amp; Tobago"))
            countries.add(Country("tv", "Tuvalu"))
            countries.add(Country("tw", "Taiwan"))
            countries.add(Country("tz", "Tanzania, United Republic Of"))
            countries.add(Country("ua", "Ukraine"))
            countries.add(Country("ug", "Uganda"))
            countries.add(Country("us", "United States"))
            countries.add(Country("uy", "Uruguay"))
            countries.add(Country("uz", "Uzbekistan"))
            countries.add(Country("va", "Holy See (vatican City State)"))
            countries.add(Country("vc", "Saint Vincent &amp; The Grenadines"))
            countries.add(Country("ve", "Venezuela, Bolivarian Republic Of"))
            countries.add(Country("vg", "British Virgin Islands"))
            countries.add(Country("vi", "US Virgin Islands"))
            countries.add(Country("vn", "Vietnam"))
            countries.add(Country("vu", "Vanuatu"))
            countries.add(Country("wf", "Wallis And Futuna"))
            countries.add(Country("ws", "Samoa"))
            countries.add(Country("xk", "Kosovo"))
            countries.add(Country("ye", "Yemen"))
            countries.add(Country("yt", "Mayotte"))
            countries.add(Country("za", "South Africa"))
            countries.add(Country("zm", "Zambia"))
            countries.add(Country("zw", "Zimbabwe"))
            return countries
        }

        fun getFlag(country: Country, context: Context, packageName: String): Int {
            return when (country.code) {
                "ad" -> context.resources.getIdentifier("flag_andorra", "drawable", packageName)
                "ae" -> context.resources.getIdentifier("flag_uae", "drawable", packageName)
                "af" -> context.resources.getIdentifier("flag_afghanistan", "drawable", packageName)
                "ag" -> context.resources.getIdentifier("flag_antigua_and_barbuda", "drawable", packageName)
                "ai" -> context.resources.getIdentifier("flag_anguilla", "drawable", packageName)
                "al" -> context.resources.getIdentifier("flag_albania", "drawable", packageName)
                "am" -> context.resources.getIdentifier("flag_armenia", "drawable", packageName)
                "ao" -> context.resources.getIdentifier("flag_angola", "drawable", packageName)
                "aq" -> context.resources.getIdentifier("flag_antarctica", "drawable", packageName)
                "ar" -> context.resources.getIdentifier("flag_argentina", "drawable", packageName)
                "as" -> context.resources.getIdentifier("flag_american_samoa", "drawable", packageName)
                "at" -> context.resources.getIdentifier("flag_austria", "drawable", packageName)
                "au" -> context.resources.getIdentifier("flag_australia", "drawable", packageName)
                "aw" -> context.resources.getIdentifier("flag_aruba", "drawable", packageName)
                "ax" -> context.resources.getIdentifier("flag_aland", "drawable", packageName)
                "az" -> context.resources.getIdentifier("flag_azerbaijan", "drawable", packageName)
                "ba" -> context.resources.getIdentifier("flag_bosnia", "drawable", packageName)
                "bb" -> context.resources.getIdentifier("flag_barbados", "drawable", packageName)
                "bd" -> context.resources.getIdentifier("flag_bangladesh", "drawable", packageName)
                "be" -> context.resources.getIdentifier("flag_belgium", "drawable", packageName)
                "bf" -> context.resources.getIdentifier("flag_burkina_faso", "drawable", packageName)
                "bg" -> context.resources.getIdentifier("flag_bulgaria", "drawable", packageName)
                "bh" -> context.resources.getIdentifier("flag_bahrain", "drawable", packageName)
                "bi" -> context.resources.getIdentifier("flag_burundi", "drawable", packageName)
                "bj" -> context.resources.getIdentifier("flag_benin", "drawable", packageName)
                "bl" -> context.resources.getIdentifier("flag_saint_barthelemy", "drawable", packageName)
                "bm" -> context.resources.getIdentifier("flag_bermuda", "drawable", packageName)
                "bn" -> context.resources.getIdentifier("flag_brunei", "drawable", packageName)
                "bo" -> context.resources.getIdentifier("flag_bolivia", "drawable", packageName)
                "br" -> context.resources.getIdentifier("flag_brazil", "drawable", packageName)
                "bs" -> context.resources.getIdentifier("flag_bahamas", "drawable", packageName)
                "bt" -> context.resources.getIdentifier("flag_bhutan", "drawable", packageName)
                "bw" -> context.resources.getIdentifier("flag_botswana", "drawable", packageName)
                "by" -> context.resources.getIdentifier("flag_belarus", "drawable", packageName)
                "bz" -> context.resources.getIdentifier("flag_belize", "drawable", packageName)
                "ca" -> context.resources.getIdentifier("flag_canada", "drawable", packageName)
                "cc" -> context.resources.getIdentifier("flag_cocos", "drawable", packageName)
                "cd" -> context.resources.getIdentifier("flag_democratic_republic_of_the_congo", "drawable", packageName)
                "cf" -> context.resources.getIdentifier("flag_central_african_republic", "drawable", packageName)
                "cg" -> context.resources.getIdentifier("flag_republic_of_the_congo", "drawable", packageName)
                "ch" -> context.resources.getIdentifier("flag_switzerland", "drawable", packageName)
                "ci" -> context.resources.getIdentifier("flag_cote_divoire", "drawable", packageName)
                "ck" -> context.resources.getIdentifier("flag_cook_islands", "drawable", packageName)
                "cl" -> context.resources.getIdentifier("flag_chile", "drawable", packageName)
                "cm" -> context.resources.getIdentifier("flag_cameroon", "drawable", packageName)
                "cn" -> context.resources.getIdentifier("flag_china", "drawable", packageName)
                "co" -> context.resources.getIdentifier("flag_colombia", "drawable", packageName)
                "cr" -> context.resources.getIdentifier("flag_costa_rica", "drawable", packageName)
                "cu" -> context.resources.getIdentifier("flag_cuba", "drawable", packageName)
                "cv" -> context.resources.getIdentifier("flag_cape_verde", "drawable", packageName)
                "cw" -> context.resources.getIdentifier("flag_curacao", "drawable", packageName)
                "cx" -> context.resources.getIdentifier("flag_christmas_island", "drawable", packageName)
                "cy" -> context.resources.getIdentifier("flag_cyprus", "drawable", packageName)
                "cz" -> context.resources.getIdentifier("flag_czech_republic", "drawable", packageName)
                "de" -> context.resources.getIdentifier("flag_germany", "drawable", packageName)
                "dj" -> context.resources.getIdentifier("flag_djibouti", "drawable", packageName)
                "dk" -> context.resources.getIdentifier("flag_denmark", "drawable", packageName)
                "dm" -> context.resources.getIdentifier("flag_dominica", "drawable", packageName)
                "do" -> context.resources.getIdentifier("flag_dominican_republic", "drawable", packageName)
                "dz" -> context.resources.getIdentifier("flag_algeria", "drawable", packageName)
                "ec" -> context.resources.getIdentifier("flag_ecuador", "drawable", packageName)
                "ee" -> context.resources.getIdentifier("flag_estonia", "drawable", packageName)
                "eg" -> context.resources.getIdentifier("flag_egypt", "drawable", packageName)
                "er" -> context.resources.getIdentifier("flag_eritrea", "drawable", packageName)
                "es" -> context.resources.getIdentifier("flag_spain", "drawable", packageName)
                "et" -> context.resources.getIdentifier("flag_ethiopia", "drawable", packageName)
                "fi" -> context.resources.getIdentifier("flag_finland", "drawable", packageName)
                "fj" -> context.resources.getIdentifier("flag_fiji", "drawable", packageName)
                "fk" -> context.resources.getIdentifier("flag_falkland_islands", "drawable", packageName)
                "fm" -> context.resources.getIdentifier("flag_micronesia", "drawable", packageName)
                "fo" -> context.resources.getIdentifier("flag_faroe_islands", "drawable", packageName)
                "fr" -> context.resources.getIdentifier("flag_france", "drawable", packageName)
                "ga" -> context.resources.getIdentifier("flag_gabon", "drawable", packageName)
                "gb" -> context.resources.getIdentifier("flag_united_kingdom", "drawable", packageName)
                "gd" -> context.resources.getIdentifier("flag_grenada", "drawable", packageName)
                "ge" -> context.resources.getIdentifier("flag_georgia", "drawable", packageName)
                "gf" -> context.resources.getIdentifier("flag_guyane", "drawable", packageName)
                "gg" -> context.resources.getIdentifier("flag_guernsey", "drawable", packageName)
                "gh" -> context.resources.getIdentifier("flag_ghana", "drawable", packageName)
                "gi" -> context.resources.getIdentifier("flag_gibraltar", "drawable", packageName)
                "gl" -> context.resources.getIdentifier("flag_greenland", "drawable", packageName)
                "gm" -> context.resources.getIdentifier("flag_gambia", "drawable", packageName)
                "gn" -> context.resources.getIdentifier("flag_guinea", "drawable", packageName)
                "gp" -> context.resources.getIdentifier("flag_guadeloupe", "drawable", packageName)
                "gq" -> context.resources.getIdentifier("flag_equatorial_guinea", "drawable", packageName)
                "gr" -> context.resources.getIdentifier("flag_greece", "drawable", packageName)
                "gt" -> context.resources.getIdentifier("flag_guatemala", "drawable", packageName)
                "gu" -> context.resources.getIdentifier("flag_guam", "drawable", packageName)
                "gw" -> context.resources.getIdentifier("flag_guinea_bissau", "drawable", packageName)
                "gy" -> context.resources.getIdentifier("flag_guyana", "drawable", packageName)
                "hk" -> context.resources.getIdentifier("flag_hong_kong", "drawable", packageName)
                "hn" -> context.resources.getIdentifier("flag_honduras", "drawable", packageName)
                "hr" -> context.resources.getIdentifier("flag_croatia", "drawable", packageName)
                "ht" -> context.resources.getIdentifier("flag_haiti", "drawable", packageName)
                "hu" -> context.resources.getIdentifier("flag_hungary", "drawable", packageName)
                "id" -> context.resources.getIdentifier("flag_indonesia", "drawable", packageName)
                "ie" -> context.resources.getIdentifier("flag_ireland", "drawable", packageName)
                "il" -> context.resources.getIdentifier("flag_israel", "drawable", packageName)
                "im" -> context.resources.getIdentifier("flag_isleof_man", "drawable", packageName)
                "is" -> context.resources.getIdentifier("flag_iceland", "drawable", packageName)
                "in" -> context.resources.getIdentifier("flag_india", "drawable", packageName)
                "io" -> context.resources.getIdentifier("flag_british_indian_ocean_territory", "drawable", packageName)
                "iq" -> context.resources.getIdentifier("flag_iraq_new", "drawable", packageName)
                "ir" -> context.resources.getIdentifier("flag_iran", "drawable", packageName)
                "it" -> context.resources.getIdentifier("flag_italy", "drawable", packageName)
                "je" -> context.resources.getIdentifier("flag_jersey", "drawable", packageName)
                "jm" -> context.resources.getIdentifier("flag_jamaica", "drawable", packageName)
                "jo" -> context.resources.getIdentifier("flag_jordan", "drawable", packageName)
                "jp" -> context.resources.getIdentifier("flag_japan", "drawable", packageName)
                "ke" -> context.resources.getIdentifier("flag_kenya", "drawable", packageName)
                "kg" -> context.resources.getIdentifier("flag_kyrgyzstan", "drawable", packageName)
                "kh" -> context.resources.getIdentifier("flag_cambodia", "drawable", packageName)
                "ki" -> context.resources.getIdentifier("flag_kiribati", "drawable", packageName)
                "km" -> context.resources.getIdentifier("flag_comoros", "drawable", packageName)
                "kn" -> context.resources.getIdentifier("flag_saint_kitts_and_nevis", "drawable", packageName)
                "kp" -> context.resources.getIdentifier("flag_north_korea", "drawable", packageName)
                "kr" -> context.resources.getIdentifier("flag_south_korea", "drawable", packageName)
                "kw" -> context.resources.getIdentifier("flag_kuwait", "drawable", packageName)
                "ky" -> context.resources.getIdentifier("flag_cayman_islands", "drawable", packageName)
                "kz" -> context.resources.getIdentifier("flag_kazakhstan", "drawable", packageName)
                "la" -> context.resources.getIdentifier("flag_laos", "drawable", packageName)
                "lb" -> context.resources.getIdentifier("flag_lebanon", "drawable", packageName)
                "lc" -> context.resources.getIdentifier("flag_saint_lucia", "drawable", packageName)
                "li" -> context.resources.getIdentifier("flag_liechtenstein", "drawable", packageName)
                "lk" -> context.resources.getIdentifier("flag_sri_lanka", "drawable", packageName)
                "lr" -> context.resources.getIdentifier("flag_liberia", "drawable", packageName)
                "ls" -> context.resources.getIdentifier("flag_lesotho", "drawable", packageName)
                "lt" -> context.resources.getIdentifier("flag_lithuania", "drawable", packageName)
                "lu" -> context.resources.getIdentifier("flag_luxembourg", "drawable", packageName)
                "lv" -> context.resources.getIdentifier("flag_latvia", "drawable", packageName)
                "ly" -> context.resources.getIdentifier("flag_libya", "drawable", packageName)
                "ma" -> context.resources.getIdentifier("flag_morocco", "drawable", packageName)
                "mc" -> context.resources.getIdentifier("flag_monaco", "drawable", packageName)
                "md" -> context.resources.getIdentifier("flag_moldova", "drawable", packageName)
                "me" -> context.resources.getIdentifier("flag_of_montenegro", "drawable", packageName)
                "mf" -> context.resources.getIdentifier("flag_saint_martin", "drawable", packageName)
                "mg" -> context.resources.getIdentifier("flag_madagascar", "drawable", packageName)
                "mh" -> context.resources.getIdentifier("flag_marshall_islands", "drawable", packageName)
                "mk" -> context.resources.getIdentifier("flag_macedonia", "drawable", packageName)
                "ml" -> context.resources.getIdentifier("flag_mali", "drawable", packageName)
                "mm" -> context.resources.getIdentifier("flag_myanmar", "drawable", packageName)
                "mn" -> context.resources.getIdentifier("flag_mongolia", "drawable", packageName)
                "mo" -> context.resources.getIdentifier("flag_macao", "drawable", packageName)
                "mp" -> context.resources.getIdentifier("flag_northern_mariana_islands", "drawable", packageName)
                "mq" -> context.resources.getIdentifier("flag_martinique", "drawable", packageName)
                "mr" -> context.resources.getIdentifier("flag_mauritania", "drawable", packageName)
                "ms" -> context.resources.getIdentifier("flag_montserrat", "drawable", packageName)
                "mt" -> context.resources.getIdentifier("flag_malta", "drawable", packageName)
                "mu" -> context.resources.getIdentifier("flag_mauritius", "drawable", packageName)
                "mv" -> context.resources.getIdentifier("flag_maldives", "drawable", packageName)
                "mw" -> context.resources.getIdentifier("flag_malawi", "drawable", packageName)
                "mx" -> context.resources.getIdentifier("flag_mexico", "drawable", packageName)
                "my" -> context.resources.getIdentifier("flag_malaysia", "drawable", packageName)
                "mz" -> context.resources.getIdentifier("flag_mozambique", "drawable", packageName)
                "na" -> context.resources.getIdentifier("flag_namibia", "drawable", packageName)
                "nc" -> context.resources.getIdentifier("flag_new_caledonia", "drawable", packageName)
                "ne" -> context.resources.getIdentifier("flag_niger", "drawable", packageName)
                "nf" -> context.resources.getIdentifier("flag_norfolk_island", "drawable", packageName)
                "ng" -> context.resources.getIdentifier("flag_nigeria", "drawable", packageName)
                "ni" -> context.resources.getIdentifier("flag_nicaragua", "drawable", packageName)
                "nl" -> context.resources.getIdentifier("flag_netherlands", "drawable", packageName)
                "no" -> context.resources.getIdentifier("flag_norway", "drawable", packageName)
                "np" -> context.resources.getIdentifier("flag_nepal", "drawable", packageName)
                "nr" -> context.resources.getIdentifier("flag_nauru", "drawable", packageName)
                "nu" -> context.resources.getIdentifier("flag_niue", "drawable", packageName)
                "nz" -> context.resources.getIdentifier("flag_new_zealand", "drawable", packageName)
                "om" -> context.resources.getIdentifier("flag_oman", "drawable", packageName)
                "pa" -> context.resources.getIdentifier("flag_panama", "drawable", packageName)
                "pe" -> context.resources.getIdentifier("flag_peru", "drawable", packageName)
                "pf" -> context.resources.getIdentifier("flag_french_polynesia", "drawable", packageName)
                "pg" -> context.resources.getIdentifier("flag_papua_new_guinea", "drawable", packageName)
                "ph" -> context.resources.getIdentifier("flag_philippines", "drawable", packageName)
                "pk" -> context.resources.getIdentifier("flag_pakistan", "drawable", packageName)
                "pl" -> context.resources.getIdentifier("flag_poland", "drawable", packageName)
                "pm" -> context.resources.getIdentifier("flag_saint_pierre", "drawable", packageName)
                "pn" -> context.resources.getIdentifier("flag_pitcairn_islands", "drawable", packageName)
                "pr" -> context.resources.getIdentifier("flag_puerto_rico", "drawable", packageName)
                "ps" ->context.resources.getIdentifier("flag_palestine", "drawable", packageName)
                "pt" -> context.resources.getIdentifier("flag_portugal", "drawable", packageName)
                "pw" -> context.resources.getIdentifier("flag_palau", "drawable", packageName)
                "py" -> context.resources.getIdentifier("flag_paraguay", "drawable", packageName)
                "qa" -> context.resources.getIdentifier("flag_qatar", "drawable", packageName)
                "re" -> context.resources.getIdentifier("flag_martinique", "drawable", packageName)
                "ro" -> context.resources.getIdentifier("flag_romania", "drawable", packageName)
                "rs" -> context.resources.getIdentifier("flag_serbia", "drawable", packageName)
                "ru" -> context.resources.getIdentifier("flag_russian_federation", "drawable", packageName)
                "rw" -> context.resources.getIdentifier("flag_rwanda", "drawable", packageName)
                "sa" -> context.resources.getIdentifier("flag_saudi_arabia", "drawable", packageName)
                "sb" -> context.resources.getIdentifier("flag_soloman_islands", "drawable", packageName)
                "sc" -> context.resources.getIdentifier("flag_seychelles", "drawable", packageName)
                "sd" -> context.resources.getIdentifier("flag_sudan", "drawable", packageName)
                "se" -> context.resources.getIdentifier("flag_sweden", "drawable", packageName)
                "sg" -> context.resources.getIdentifier("flag_singapore", "drawable", packageName)
                "sh" -> context.resources.getIdentifier("flag_saint_helena", "drawable", packageName)
                "si" -> context.resources.getIdentifier("flag_slovenia", "drawable", packageName)
                "sk" -> context.resources.getIdentifier("flag_slovakia", "drawable", packageName)
                "sl" -> context.resources.getIdentifier("flag_sierra_leone", "drawable", packageName)
                "sm" -> context.resources.getIdentifier("flag_san_marino", "drawable", packageName)
                "sn" -> context.resources.getIdentifier("flag_senegal", "drawable", packageName)
                "so" -> context.resources.getIdentifier("flag_somalia", "drawable", packageName)
                "sr" -> context.resources.getIdentifier("flag_suriname", "drawable", packageName)
                "ss" -> context.resources.getIdentifier("flag_south_sudan", "drawable", packageName)
                "st" -> context.resources.getIdentifier("flag_sao_tome_and_principe", "drawable", packageName)
                "sv" -> context.resources.getIdentifier("flag_el_salvador", "drawable", packageName)
                "sx" -> context.resources.getIdentifier("flag_sint_maarten", "drawable", packageName)
                "sy" -> context.resources.getIdentifier("flag_syria", "drawable", packageName)
                "sz" -> context.resources.getIdentifier("flag_swaziland", "drawable", packageName)
                "tc" -> context.resources.getIdentifier("flag_turks_and_caicos_islands", "drawable", packageName)
                "td" -> context.resources.getIdentifier("flag_chad", "drawable", packageName)
                "tg" -> context.resources.getIdentifier("flag_togo", "drawable", packageName)
                "th" -> context.resources.getIdentifier("flag_thailand", "drawable", packageName)
                "tj" -> context.resources.getIdentifier("flag_tajikistan", "drawable", packageName)
                "tk" -> context.resources.getIdentifier("flag_tokelau", "drawable", packageName)
                "tl" -> context.resources.getIdentifier("flag_timor_leste", "drawable", packageName)
                "tm" -> context.resources.getIdentifier("flag_turkmenistan", "drawable", packageName)
                "tn" -> context.resources.getIdentifier("flag_tunisia", "drawable", packageName)
                "to" -> context.resources.getIdentifier("flag_tonga", "drawable", packageName)
                "tr" -> context.resources.getIdentifier("flag_turkey", "drawable", packageName)
                "tt" -> context.resources.getIdentifier("flag_trinidad_and_tobago", "drawable", packageName)
                "tv" -> context.resources.getIdentifier("flag_tuvalu", "drawable", packageName)
                "tw" -> context.resources.getIdentifier("flag_taiwan", "drawable", packageName)
                "tz" -> context.resources.getIdentifier("flag_tanzania", "drawable", packageName)
                "ua" -> context.resources.getIdentifier("flag_ukraine", "drawable", packageName)
                "ug" -> context.resources.getIdentifier("flag_uganda", "drawable", packageName)
                "us" -> context.resources.getIdentifier("flag_united_states_of_america", "drawable", packageName)
                "uy" -> context.resources.getIdentifier("flag_uruguay", "drawable", packageName)
                "uz" -> context.resources.getIdentifier("flag_uzbekistan", "drawable", packageName)
                "va" -> context.resources.getIdentifier("flag_vatican_city", "drawable", packageName)
                "vc" -> context.resources.getIdentifier("flag_saint_vicent_and_the_grenadines", "drawable", packageName)
                "ve" -> context.resources.getIdentifier("flag_venezuela", "drawable", packageName)
                "vg" -> context.resources.getIdentifier("flag_british_virgin_islands", "drawable", packageName)
                "vi" -> context.resources.getIdentifier("flag_us_virgin_islands", "drawable", packageName)
                "vn" -> context.resources.getIdentifier("flag_vietnam", "drawable", packageName)
                "vu" -> context.resources.getIdentifier("flag_vanuatu", "drawable", packageName)
                "wf" -> context.resources.getIdentifier("flag_wallis_and_futuna", "drawable", packageName)
                "ws" -> context.resources.getIdentifier("flag_samoa", "drawable", packageName)
                "xk" -> context.resources.getIdentifier("flag_kosovo", "drawable", packageName)
                "ye" -> context.resources.getIdentifier("flag_yemen", "drawable", packageName)
                "yt" -> context.resources.getIdentifier("flag_martinique", "drawable", packageName)
                "za" -> context.resources.getIdentifier("flag_south_africa", "drawable", packageName)
                "zm" -> context.resources.getIdentifier("flag_zambia", "drawable", packageName)
                "zw" -> context.resources.getIdentifier("flag_zimbabwe", "drawable", packageName)
                else -> context.resources.getIdentifier("flag_transparent", "drawable", packageName)
            }
        }
    }
}