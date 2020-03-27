package com.example.ivenglish.dbhelper.import

import com.example.ivenglish.dbhelper.DBHelper
import com.example.ivenglish.model.Quiz

fun importAll (db: DBHelper) {
    val list = ArrayList<Quiz>()
    db.deleteAllQuiz()
    
    
    list.add(
        Quiz(
            "(se) réveiller",
            "to awake",
            "awoke",
            "awoken"
        )
    )
    list.add(
        Quiz(
            "supporter",
            "to bear",
            "bore",
            "borne"
        )
    )
    list.add(
        Quiz(
            "battre",
            "to beat",
            "beat",
            "beaten"
        )
    )
    list.add(
        Quiz(
            "devenir",
            "to become",
            "became",
            "become"
        )
    )
    list.add(
        Quiz(
            "commencer",
            "to begin",
            "began",
            "begun"
        )
    )
    list.add(
        Quiz(
            "(se) courber",
            "to bend",
            "bent",
            "bent"
        )
    )
    list.add(
        Quiz(
            "parier",
            "to bet",
            "bet",
            "bet"
        )
    )
    list.add(
        Quiz(
            "offrir (un prix)",
            "to bid",
            "bid",
            "bid"
        )
    )
    list.add(
        Quiz(
            "lier, relier",
            "to bind",
            "bound",
            "bound"
        )
    )
    list.add(
        Quiz(
            "mordre",
            "to bite",
            "bit",
            "bitten"
        )
    )
    list.add(
        Quiz(
            "saigner",
            "to bleed",
            "bled",
            "bled"
        )
    )
    list.add(
        Quiz(
            "souffler",
            "to blow",
            "blew",
            "blown"
        )
    )
    list.add(
        Quiz(
            "casser",
            "to break",
            "broke",
            "broken"
        )
    )
    list.add(
        Quiz(
            "élever (du bétail)",
            "to breed",
            "bred",
            "bred"
        )
    )
    list.add(
        Quiz(
            "apporter",
            "to bring",
            "brought",
            "brought"
        )
    )
    list.add(
        Quiz(
            "construire",
            "to build",
            "built",
            "built"
        )
    )
    list.add(
        Quiz(
            "brûler",
            "to burn",
            "burnt",
            "burnt"
        )
    )
    list.add(
        Quiz(
            "éclater",
            "to burst",
            "burst",
            "burst"
        )
    )
    list.add(
        Quiz(
            "acheter",
            "to buy",
            "bought",
            "bought"
        )
    )
    list.add(
        Quiz(
            "jeter",
            "to cast",
            "cast",
            "cast"
        )
    )
    list.add(
        Quiz(
            "attraper",
            "to catch",
            "caught",
            "caught"
        )
    )
    list.add(
        Quiz(
            "choisir",
            "to choose",
            "chose",
            "chosen"
        )
    )
    list.add(
        Quiz(
            "s'accrocher",
            "to cling",
            "clung",
            "clung"
        )
    )
    list.add(
        Quiz(
            "venir",
            "to come",
            "came",
            "come"
        )
    )
    list.add(
        Quiz(
            "coûter",
            "to cost",
            "cost",
            "cost"
        )
    )
    list.add(
        Quiz(
            "ramper",
            "to creep",
            "crept",
            "crept"
        )
    )
    list.add(
        Quiz(
            "couper",
            "to cut",
            "cut",
            "cut"
        )
    )
    list.add(
        Quiz(
            "distribuer",
            "to deal",
            "dealt",
            "dealt"
        )
    )
    list.add(
        Quiz(
            "creuser",
            "to dig",
            "dig",
            "dig"
        )
    )
    list.add(
        Quiz(
            "faire",
            "to do",
            "did",
            "done"
        )
    )
    list.add(
        Quiz(
            "dessiner",
            "to draw",
            "drew",
            "drawn"
        )
    )
    list.add(
        Quiz(
            "rêver",
            "to dream",
            "dreamt",
            "dreamt"
        )
    )
    list.add(
        Quiz(
            "boire",
            "to drink",
            "drank",
            "drunk"
        )
    )
    list.add(
        Quiz(
            "conduire",
            "to drive",
            "drove",
            "driven"
        )
    )
    list.add(
        Quiz(
            "habiter",
            "to dwell",
            "dwelt",
            "dwelt"
        )
    )
    list.add(
        Quiz(
            "manger",
            "to eat",
            "ate",
            "eaten"
        )
    )
    list.add(
        Quiz(
            "tomber",
            "to fall",
            "fell",
            "fallen"
        )
    )
    list.add(
        Quiz(
            "nourrir",
            "to feed",
            "fed",
            "fed"
        )
    )
    list.add(
        Quiz(
            "sentir, éprouver",
            "to feel",
            "felt",
            "felt"
        )
    )
    list.add(
        Quiz(
            "combattre",
            "to fight",
            "fought",
            "fought"
        )
    )
    list.add(
        Quiz(
            "trouver",
            "to find",
            "found",
            "found"
        )
    )
    list.add(
        Quiz(
            "s'enfuir",
            "to flee",
            "fled",
            "fled"
        )
    )
    list.add(
        Quiz(
            "jeter violemment",
            "to fling",
            "flung",
            "flung"
        )
    )
    list.add(
        Quiz(
            "voler",
            "to fly",
            "flew",
            "flown"
        )
    )
    list.add(
        Quiz(
            "interdire",
            "to forbid",
            "forbade",
            "forbidden"
        )
    )
    list.add(
        Quiz(
            "oublier",
            "to forget",
            "forgot",
            "forgotten"
        )
    )
    list.add(
        Quiz(
            "pardonner",
            "to forgive",
            "forgave",
            "forgiven"
        )
    )
    list.add(
        Quiz(
            "geler",
            "to freeze",
            "froze",
            "frozen"
        )
    )
    list.add(
        Quiz(
            "obtenir",
            "to get",
            "got",
            "got"
        )
    )
    list.add(
        Quiz(
            "donner",
            "to give",
            "gave",
            "given"
        )
    )
    list.add(
        Quiz(
            "aller",
            "to go",
            "went",
            "gone"
        )
    )
    list.add(
        Quiz(
            "moudre",
            "to grind",
            "ground",
            "ground"
        )
    )
    list.add(
        Quiz(
            "grandir",
            "to grow",
            "grew",
            "grown"
        )
    )
    list.add(
        Quiz(
            "pendre, accrocher",
            "to hang",
            "hung",
            "hung"
        )
    )
    list.add(
        Quiz(
            "avoir",
            "to have",
            "had",
            "had"
        )
    )
    list.add(
        Quiz(
            "entendre",
            "to hear",
            "heard",
            "heard"
        )
    )
    list.add(
        Quiz(
            "(se) cacher",
            "to hide",
            "hid",
            "hidden"
        )
    )
    list.add(
        Quiz(
            "frapper, atteindre",
            "to hit",
            "hit",
            "hit"
        )
    )
    list.add(
        Quiz(
            "tenir",
            "to hold",
            "held",
            "held"
        )
    )
    list.add(
        Quiz(
            "blesser",
            "to hurt",
            "hurt",
            "hurt"
        )
    )
    list.add(
        Quiz(
            "garder",
            "to keep",
            "kept",
            "kept"
        )
    )
    list.add(
        Quiz(
            "s'agenouiller",
            "to kneel",
            "knelt",
            "knelt"
        )
    )
    list.add(
        Quiz(
            "savoir, connaître",
            "to know",
            "knew",
            "known"
        )
    )
    list.add(
        Quiz(
            "poser à plat",
            "to lay",
            "laid",
            "laid"
        )
    )
    list.add(
        Quiz(
            "mener",
            "to lead",
            "led",
            "led"
        )
    )
    list.add(
        Quiz(
            "s'appuyer",
            "to lean",
            "leant",
            "leant"
        )
    )
    list.add(
        Quiz(
            "sauter",
            "to leap",
            "leapt",
            "leapt"
        )
    )
    list.add(
        Quiz(
            "apprendre",
            "to learn",
            "learnt",
            "learnt"
        )
    )
    list.add(
        Quiz(
            "laisser, quitter",
            "to leave",
            "left",
            "left"
        )
    )
    list.add(
        Quiz(
            "prêter",
            "to lend",
            "lent",
            "lent"
        )
    )
    list.add(
        Quiz(
            "permettre, louer",
            "to let",
            "let",
            "let"
        )
    )
    list.add(
        Quiz(
            "être étendu",
            "to lie",
            "lay",
            "lain"
        )
    )
    list.add(
        Quiz(
            "allumer",
            "to light",
            "lit",
            "lit"
        )
    )
    list.add(
        Quiz(
            "perdre",
            "to lose",
            "lost",
            "lost"
        )
    )
    list.add(
        Quiz(
            "faire, fabriquer",
            "to make",
            "made",
            "made"
        )
    )
    list.add(
        Quiz(
            "signifier",
            "to mean",
            "meant",
            "meant"
        )
    )
    list.add(
        Quiz(
            "(se) rencontrer",
            "to meet",
            "met",
            "met"
        )
    )
    list.add(
        Quiz(
            "payer",
            "to pay",
            "paid",
            "paid"
        )
    )
    list.add(
        Quiz(
            "mettre",
            "to put",
            "put",
            "put"
        )
    )
    list.add(
        Quiz(
            "cesser (de)",
            "to quit",
            "quit",
            "quit"
        )
    )
    list.add(
        Quiz(
            "lire",
            "to read",
            "read",
            "read"
        )
    )
    list.add(
        Quiz(
            "(se) débarrasser",
            "to rid",
            "rid",
            "rid"
        )
    )
    list.add(
        Quiz(
            "chevaucher",
            "to ride",
            "rode",
            "ridden"
        )
    )
    list.add(
        Quiz(
            "sonner",
            "to ring",
            "rang",
            "rung"
        )
    )
    list.add(
        Quiz(
            "s'élever, se lever",
            "to rise",
            "rose",
            "risen"
        )
    )
    list.add(
        Quiz(
            "courir",
            "to run",
            "ran",
            "run"
        )
    )
    list.add(
        Quiz(
            "scier",
            "to saw",
            "sawed",
            "sawn"
        )
    )
    list.add(
        Quiz(
            "dire",
            "to say",
            "said",
            "said"
        )
    )
    list.add(
        Quiz(
            "voir",
            "to see",
            "saw",
            "seen"
        )
    )
    list.add(
        Quiz(
            "chercher",
            "to seek",
            "sought",
            "sought"
        )
    )
    list.add(
        Quiz(
            "vendre",
            "to sell",
            "sold",
            "sold"
        )
    )
    list.add(
        Quiz(
            "envoyer",
            "to send",
            "sent",
            "sent"
        )
    )
    list.add(
        Quiz(
            "fixer",
            "to set",
            "set",
            "set"
        )
    )
    list.add(
        Quiz(
            "coudre",
            "to sew",
            "sewed",
            "sewn"
        )
    )
    list.add(
        Quiz(
            "secouer",
            "to shake",
            "shook",
            "shaken"
        )
    )
    list.add(
        Quiz(
            "tondre (des moutons)",
            "to shear",
            "sheared",
            "shorn"
        )
    )
    list.add(
        Quiz(
            "verser (des larmes)",
            "to shed",
            "shed",
            "shed"
        )
    )
    list.add(
        Quiz(
            "briller",
            "to shine",
            "shone",
            "shone"
        )
    )
    list.add(
        Quiz(
            "ferrer, chausser",
            "to shoe",
            "shod",
            "shod"
        )
    )
    list.add(
        Quiz(
            "tirer",
            "to shoot",
            "shot",
            "shot"
        )
    )
    list.add(
        Quiz(
            "montrer",
            "to show",
            "showed",
            "shown"
        )
    )
    list.add(
        Quiz(
            "retrécir",
            "to shrink",
            "shrank",
            "shrunk"
        )
    )
    list.add(
        Quiz(
            "fermer",
            "to shut",
            "shut",
            "shut"
        )
    )
    list.add(
        Quiz(
            "chanter",
            "to sing",
            "sang",
            "sung"
        )
    )
    list.add(
        Quiz(
            "couler",
            "to sink",
            "sank",
            "sunk"
        )
    )
    list.add(
        Quiz(
            "être assis",
            "to sit",
            "sat",
            "sat"
        )
    )
    list.add(
        Quiz(
            "dormir",
            "to sleep",
            "slept",
            "slept"
        )
    )
    list.add(
        Quiz(
            "glisser",
            "to slide",
            "slid",
            "slid"
        )
    )
    list.add(
        Quiz(
            "lancer (avec force)",
            "to sling",
            "slung",
            "slung"
        )
    )
    list.add(
        Quiz(
            "aller furtivement",
            "to slink",
            "slunk",
            "slunk"
        )
    )
    list.add(
        Quiz(
            "fendre, inciser",
            "to slit",
            "slit",
            "slit"
        )
    )
    list.add(
        Quiz(
            "sentir (odorat)",
            "to smell",
            "smelt",
            "smelt"
        )
    )
    list.add(
        Quiz(
            "semer",
            "to sow",
            "sowed",
            "sown"
        )
    )
    list.add(
        Quiz(
            "parler",
            "to speak",
            "spoke",
            "spoken"
        )
    )
    list.add(
        Quiz(
            "aller à toute vitesse",
            "to speed",
            "sped",
            "sped"
        )
    )
    list.add(
        Quiz(
            "épeler",
            "to spell",
            "spelt",
            "spelt"
        )
    )
    list.add(
        Quiz(
            "dépenser",
            "to spend",
            "spent",
            "spent"
        )
    )
    list.add(
        Quiz(
            "renverser (un liquide)",
            "to spill",
            "spilt",
            "spilt"
        )
    )
    list.add(
        Quiz(
            "cracher",
            "to spit",
            "spat",
            "spat"
        )
    )
    list.add(
        Quiz(
            "fendre",
            "to split",
            "split",
            "split"
        )
    )
    list.add(
        Quiz(
            "gâcher, gâter",
            "to spoil",
            "spoilt",
            "spoilt"
        )
    )
    list.add(
        Quiz(
            "répandre",
            "to spread",
            "spread",
            "spread"
        )
    )
    list.add(
        Quiz(
            "jaillir, bondir",
            "to spring",
            "sprang",
            "sprung"
        )
    )
    list.add(
        Quiz(
            "être debout",
            "to stand",
            "stood",
            "stood"
        )
    )
    list.add(
        Quiz(
            "voler, dérober",
            "to steal",
            "stole",
            "stolen"
        )
    )
    list.add(
        Quiz(
            "coller",
            "to stick",
            "stuck",
            "stuck"
        )
    )
    list.add(
        Quiz(
            "piquer",
            "to sting",
            "stung",
            "stung"
        )
    )
    list.add(
        Quiz(
            "puer",
            "to stink",
            "stank",
            "stunk"
        )
    )
    list.add(
        Quiz(
            "marcher à grand pas",
            "to stride",
            "strode",
            "stridden"
        )
    )
    list.add(
        Quiz(
            "frapper",
            "to strike",
            "struck",
            "struck"
        )
    )
    list.add(
        Quiz(
            "enfiler, tendre (une corde)",
            "to string",
            "strung",
            "strung"
        )
    )
    list.add(
        Quiz(
            "s'efforcer",
            "to strive",
            "strove",
            "striven"
        )
    )
    list.add(
        Quiz(
            "jurer",
            "to swear",
            "swore",
            "sworn"
        )
    )
    list.add(
        Quiz(
            "balayer",
            "to sweep",
            "swept",
            "swept"
        )
    )
    list.add(
        Quiz(
            "enfler",
            "to swell",
            "swelled",
            "swollen"
        )
    )
    list.add(
        Quiz(
            "nager",
            "to swim",
            "swam",
            "swum"
        )
    )
    list.add(
        Quiz(
            "se balancer",
            "to swing",
            "swung",
            "swung"
        )
    )
    list.add(
        Quiz(
            "prendre",
            "to take",
            "took",
            "taken"
        )
    )
    list.add(
        Quiz(
            "enseigner",
            "to teach",
            "taught",
            "taught"
        )
    )
    list.add(
        Quiz(
            "déchirer",
            "to tear",
            "tore",
            "torn"
        )
    )
    list.add(
        Quiz(
            "dire, raconter",
            "to tell",
            "told",
            "told"
        )
    )
    list.add(
        Quiz(
            "penser",
            "to think",
            "thought",
            "thought"
        )
    )
    list.add(
        Quiz(
            "jeter",
            "to throw",
            "threw",
            "thrown"
        )
    )
    list.add(
        Quiz(
            "enfoncer",
            "to thrust",
            "thrust",
            "thrust"
        )
    )
    list.add(
        Quiz(
            "fouler aux pieds",
            "to tread",
            "trod",
            "trodden"
        )
    )
    list.add(
        Quiz(
            "comprendre",
            "to understand",
            "understood",
            "understood"
        )
    )
    list.add(
        Quiz(
            "(se) réveiller",
            "to wake",
            "woke",
            "woken"
        )
    )
    list.add(
        Quiz(
            "porter (des vêtements)",
            "to wear",
            "wore",
            "worn"
        )
    )
    list.add(
        Quiz(
            "tisser",
            "to weave",
            "wove",
            "woven"
        )
    )
    list.add(
        Quiz(
            "pleurer",
            "to weep",
            "wept",
            "wept"
        )
    )
    list.add(
        Quiz(
            "gagner",
            "to win",
            "won",
            "won"
        )
    )
    list.add(
        Quiz(
            "enrouler",
            "to wind",
            "wound",
            "wound"
        )
    )
    list.add(
        Quiz(
            "tordre",
            "to wring",
            "wrung",
            "wrung"
        )
    )
    list.add(
        Quiz(
            "écrire",
            "to write",
            "wrote",
            "wrote"
        )
    )

    db.addQuizs(list)
}

