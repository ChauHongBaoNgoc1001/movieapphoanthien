package com.example.movieapp_hoanthien

class Datasource {
    fun list(): List<Phim> {
        return listOf(
            Phim(
                "FAST X",
                "Over many missions and against impossible odds, Dom Toretto and his family have outsmarted, out-nerved and outdriven every foe in their path. Now, they confront the most lethal opponent they've ever faced: A terrifying threat emerging from the shadows of the past who's fueled by blood revenge, and who is determined to shatter this family and destroy everything—and everyone—that Dom loves, forever.",
                "https://th.bing.com/th?id=OIF.JxAQ3K3ketWjStylIE%2b2Uw&pid=ImgDet&rs=1",
                "Director: Louis Leterrier", // đạo diễn
                "Time: 141 minutes",
                "Category: Fantasy , Action", //thể loại
                "Performer: Vin Diesel,Michelle Rodriguez,Jason Statham,Tyrese Gibson, Jason Momoa, John Cena ... "
            ),
            Phim(
                "THE SUPER MARIO BROS MOVIE",
                "While working underground to fix a water main, Brooklyn plumbers—and brothers—Mario and Luigi are transported down a mysterious pipe and wander into a magical new world. But when the brothers are separated, Mario embarks on an epic quest to find Luigi",
                "https://upload.wikimedia.org/wikipedia/en/4/44/The_Super_Mario_Bros._Movie_poster.jpg",
                "Director: Aaron Horvath, Michael Jelenic",
                "Time: 93 minutes",
                "Category: Animation , Comedy , Adventure ",
                "Performer: Chris Pratt, Jack Black, Anya Taylor Joy, Charlie Day, Keegan Michael Key, ... "
            ),
            Phim(
                "THE BLACK DEMON",
                "Oilman Paul Sturges' idyllic family vacation turns into a nightmare when they encounter a ferocious megalodon shark that will stop at nothing to protect its territory. Stranded and under constant attack, Paul and his family must somehow find a way to get his family back to shore alive before it strikes again in this epic battle between humans and nature.",
                "https://m.media-amazon.com/images/M/MV5BODBhZTFiOGItNjk4ZS00Y2VkLWJkNGQtNTk5NzZlNThlM2I4XkEyXkFqcGdeQXVyMzQwMTY2Nzk@._V1_FMjpg_UX1000_.jpg",
                "Director: Adrian Grunberg",
                "Time: _ ",
                "Category: Act",
                "Performer: Josh Lucas, Fernanda Urrejola, Raul Mendez, Hector Jimenez, Julio Cesar Cedillo, Venus Ariel, ...   "
            ),
            Phim(
                "SPIDER- MAN: ACROSS THE SPIDER-VERSE",
                "After reuniting with Gwen Stacy, Brooklyn’s full-time, friendly neighborhood Spider-Man is catapulted across the Multiverse, where he encounters the Spider Society, a team of Spider-People charged with protecting the Multiverse’s very existence. But when the heroes clash on how to handle a new threat, Miles finds himself pitted against the other Spiders and must set out on his own to save those he loves most.",
                "https://th.bing.com/th/id/OIF.M959gdw47M4GqrQGrfolcQ?pid=ImgDet&rs=1",
                "Director: Joaquim Dos Santos, Kemp Powers, Justin K Thompson",
                "Time: 140 minutes",
                "Category: Fantasy , Animation , Action , Adventure , Superhero ",
                "Performer: Shameik Moore, Hailee Steinfeld, Oscar Isaac,Jake Johnson, Brian Tiree Henry, ... "
            ),
            Phim(
                "THE LITTLE MERMAID",
                "The youngest of King Triton’s daughters, and the most defiant, Ariel longs to find out more about the world beyond the sea, and while visiting the surface, falls for the dashing Prince Eric. With mermaids forbidden to interact with humans, Ariel makes a deal with the evil sea witch, Ursula, which gives her a chance to experience life on land, but ultimately places her life – and her father’s crown – in jeopardy.",
                "https://m.media-amazon.com/images/M/MV5BYTUxYjczMWUtYzlkZC00NTcwLWE3ODQtN2I2YTIxOTU0ZTljXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg",
                "Director: Rob Marshall",
                "Time: 135 minutes",
                "Category: Fantasy , Live action , Adventure , Music ",
                "Performer: Halle Bailey, Jonah Hauer King, Melissa McCarthy, Javier Bardem, Jude Akuwudike, ..."
            ),

            Phim(
                "LEGO DC COMICS SUPER HEROES: THE FLASH ",
                "Reverse-Flash manipulates the Speed Force to put the Flash into a time loop that forces him to relive the same day over and over again—with progressively disastrous results, including losing his powers and being fired by the Justice League. The Flash must find a way to restore time to its original path and finally apprehend his worst enemy before all is lost for the Flash…and the world! ",
                "https://yts.torrentbay.net/assets/images/movies/lego_dc_comics_super_heroes_the_flash_2018/medium-cover.jpg?v=91?v=0.1 ",
                "Director: Ethan Spaulding  ",
                "Time: 78 minutes",
                "Category: Action, Animation, Sci-Fi ",
                "Performer: Kate Micucci, Grey Griffin, Kevin Michael Richardson , Troy Baker, ...   "
            ),
            Phim(
                "COPACUL DORINTELOR: AMINTIRI DIN COPILARIE ",
                "Mara, a 12 year old who is ill, embarks on a fantastic adventure filled with hope. She discovers a magical tree located near a palliative care center that is a portal to her favorite story: the book of Ion Creanga,  ",
                "https://th.bing.com/th/id/R.661f07c12e3685f316d67d0fceec1f23?rik=iPMzZlcz7peZjg&pid=ImgRaw&r=0",
                "Director: Andrei Hutuleac  ",
                "Time: 89 minutes",
                "Category: Family,Fantasy ",
                "Performer:   Matei Dima, ..."
            ),
            Phim(
                "BATMAN NINJA ",
                "Batman Ninja takes a journey across the ages as Gorilla Grodd's time displacement machine transports many of Batman's worst enemies to feudal Japan - along with the Dark Knight and a few of his allies. The villains take over the forms of the feudal lords that rule the divided land, with the Joker taking the lead among the warring factions. As his traditional high-tech weaponry is exhausted almost immediately, Batman must rely on his intellect and his allies - including Catwoman and the extended Bat-family - to restore order to the land, and return to present-day Gotham City. ",
                "https://upload.wikimedia.org/wikipedia/en/9/91/Batman-ninja---blu-ray-cover-1518549457339_1280w.jpg",
                "Director: Junpei Mizusaki ",
                "Time: 85 minutes",
                "Category: Action, Animation, Sci-Fi  ",
                "Performer: Kôichi Yamadera, Wataru Takagi, Ai Kakuma, Rie Kugimiya ,  Atsuko Tanaka, ...  "
            ),
            Phim(
                "MOON ",
                "Astronaut Sam Bell has a quintessentially personal encounter toward the end of his three-year stint on the Moon, where he, working alongside his computer, GERTY, sends back to Earth parcels of a resource that has helped diminish our planet's power problems. ",
                "https://m.media-amazon.com/images/M/MV5BMTgzODgyNTQwOV5BMl5BanBnXkFtZTcwNzc0NTc0Mg@@._V1_.jpg ",
                "Director: Duncan Jones ",
                "Time: 97 minutes",
                "Category:  drama, Mystery, sci-fi",
                "Performer: Sam Rockwell, Kevin Spacey,Dominique McElligott, Rosie Shaw,  Adrienne Shaw, ... "
            ),
            Phim(
                "DETECTIVE CONAN: BLACK IRON SUBMARINE ",
                "Set in Pacific Buoy - an Interpol maritime headquarters tasked with connecting security cameras around the world. At Sonoko's invitation, Conan's group went to Hachijojima to see whales. There, Conan receives information about a Europol employee being assassinated. Along with that, Haibara's life was threatened, was her identity revealed to Gin - the leading dangerous character of the black organization...  ",
                "https://anime.atsit.in/l/wp-content/uploads/2022/12/tham-tu-lung-danh-conan-tiet-lo-qua-khu-cua-haibara-ai-phat-hanh-phim-truyen-hinh-tong-hop-truoc-phim-the-black-iron-submarine.jpg",
                " Director: Yuzuru Tachikawa",
                "Time: 110  ",
                "Category: Cartoon ",
                "Performer: Yamazaki Wakana,  Hayashibara Megumi,  Takayama Minami"
            ),
            Phim(
                "TO CATCH A KILLER ",
                "Baltimore. New Year's Eve. A talented but troubled police officer is recruited by the FBI's chief investigator to help profile and track down a mass murderer. ",
                "https://yts.torrentbay.net/assets/images/movies/to_catch_a_killer_2023/medium-cover.jpg?v=91?v=0.1 ",
                "Director: Damiasn Szifron ",
                "Time: 119 minutes ",
                "Category:  Action, Crime, Drama, Mystery, Thriller",
                "Performer: Ben Mendelsohn,Shailene Woodley, Ralph Ineson, Jovan Adepo , ...  "
            ),
            Phim(
                "RUBY GILLMAN, TEENAGE KRAKEN ",
                "Ruby Gillman, a sweet and awkward high school student, discovers she's a direct descendant of the warrior kraken queens. The kraken are sworn to protect the oceans of the world against the vain, power-hungry mermaids. Destined to inherit the throne from her commanding grandmother, Ruby must use her newfound powers to protect those she loves most. ",
                "https://yts.torrentbay.net/assets/images/movies/ruby_gillman_teenage_kraken_2023/medium-cover.jpg?v=91?v=0.1 ",
                "Director: Kirk De Micco ",
                "Time: 91 minutes ",
                "Category:  Action, Adventure, Animation, Comedy, Family,Fantasy ",
                "Performer: Annie Murphy, Toni Collette, Jane Fonda, Sam Richardson, ...   "
            ),
            Phim(
                "MONKEY BUSINESS ",
                "Research chemist Barnaby Fulton works on a fountain of youth pill for a chemical company. One of the labs chimps gets loose in the laboratory and mixes chemicals, but then pours the mix into the water cooler. When trying one of his own samples, washed down with water from the cooler, Fulton begins to act just like a twenty-year-old and believes his potion is working. Soon his wife and boss are also behaving like children. ",
                "https://yts.torrentbay.net/assets/images/movies/monkey_business_1952/medium-cover.jpg?v=91?v=0.1 ",
                "Director: Howard Hawks ",
                "Time: 96 minutes",
                "Category: Comedy, Sci-Fi ",
                "Performer: Marilyn Monroe, Cary Grant , Ginger Rogers, Dabbs Greer , ... "
            ),
            Phim(
                "ELEMENTAL ",
                "Follows Ember and Wade, in a city where fire-, water-, land- and air-residents live together. ",
                "https://baodongnai.com.vn/dataimages/202306/original/images2532325_18_1.jpg",
                "Director: Peter Sohn ",
                "Time: 1001 minutes",
                "Category: Animation, adventrue, comedy  ",
                "Performer: Leah Lewis, Mamoudou Athie, Ronnie Del Carmen,  Shila Ommi, ...   "
            ),
            Phim(
                "COCO ",
                "Aspiring musician Miguel, confronted with his family's ancestral ban on music, enters the Land of the Dead to find his great-great-grandfather, a legendary singer. ",
                "https://culturela.org/wp-content/uploads/2018/08/Coco.jpg",
                "Director: Lee Unkrich, Adrian Molina ",
                "Time: 105 minutes",
                "Category:  Animation, adventrue, drama ",
                "Performer: Anthony Gonzalez, Gael García Bernal, Benjamin Bratt, Alanna Ubach, Renee Victor, ...  "
            ),
            Phim(
                "TRANSFORMERS: RISE OF THE BEASTS",
                "When a new threat capable of destroying the entire planet emerges, Optimus Prime and the Autobots must team up with a powerful faction known as the Maximals. With the fate of humanity hanging in the balance, humans Noah and Elena will do whatever it takes to help the Transformers as they engage in the ultimate battle to save Earth.",
                "https://image.tmdb.org/t/p/w400/gPbM0MK8CP8A174rmUwGsADNYKD.jpg",
                "Director: Steven Caple Jr",
                "Time: 127 minutes",
                "Category: Fantasy , Action , Adventure ",
                "Performer: Peter Cullen, Pete Davidson, Duong Tu Quynh, Peter Dinklage, Ron Perlman, Cristo Fernandez,... "
            ),
            Phim(
                "HYPONTIC",
                "A detective becomes entangled in a mystery involving his missing daughter and a secret government program while investigating a string of reality-bending crimes.",
                "https://musicart.xboxlive.com/7/1e166600-0000-0000-0000-000000000002/504/image.jpg?w=1920&h=1080",
                "Director: Robert Rodriguez",
                "Time:93 minutes ",
                "Category: Mystery, Action, Suspense ",
                "Performer:Ben Affleck, Alice Braga, William Fichtner, JD Pardo , ..."
            ),
            Phim(
                "GUARDIANS OF THE GALAXY VOL.3",
                " Peter Quill, still reeling from the loss of Gamora, must rally his team around him to defend the universe along with protecting one of their own. A mission that, if not completed successfully, could quite possibly lead to the end of the Guardians as we know them.",
                "https://m.media-amazon.com/images/M/MV5BMDgxOTdjMzYtZGQxMS00ZTAzLWI4Y2UtMTQzN2VlYjYyZWRiXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_FMjpg_UX1000_.jpg",
                "Director: James Gunn",
                "Time: 149 minutes",
                "Category: Fantasy , Comedy , Action , Live action , Adventure , Superhero ",
                "Performer: Chris Pratt, Bradley Cooper, Pom Klementieff, Dave Bautista, Karen Gillan, ...   "
            ),
            Phim(
                "EVIL DEAD RISE",
                "A reunion between two estranged sisters gets cut short by the rise of flesh-possessing demons, thrusting them into a primal battle for survival as they face the most nightmarish version of family imaginable.",
                "https://cinematone.info/public/pic/230410195928_posters-evil_dead_rise_ver2_9j5jF.jpg",
                "Director: Lee Cronin ",
                "Time: 120 minutes",
                "Category: Thriller , Horror ",
                "Performer: Alyssa Sutherland, Lily Sullivan, Morgan Davies, Nell Fisher, Jayden Daniels,Gabrielle Echols, ... "
            ),
            Phim(
                "INSIDIOUS: THE RED DOOR",
                "To put their demons to rest once and for all, Josh Lambert and a college-aged Dalton Lambert must go deeper into The Further than ever before, facing their family's dark past and a host of new and more horrifying terrors that lurk behind the red door.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZTzSVH9Bd-anwC5o6cfoJEUbLTmy49yLusl9e6MFJS8KTzRXMMnMGcv9857wl5e7g8Y8&usqp=CAU",
                "Director: Patrick Wilson",
                "Time: 107 minutes",
                "Category: Thriller , Horror ",
                "Performer: Patrick Wilson, Ty Simpkins, Rose Byrne, Andrew Astor, Hiam Abbass, ..."
            ),
            Phim(
                "MISSION: IMPOSSIBLE - DEAD RECKONING PART ONE",
                "Ethan Hunt and his IMF team embark on their most dangerous mission yet: To track down a terrifying new weapon that threatens all of humanity before it falls into the wrong hands. With control of the future and the world's fate at stake and dark forces from Ethan's past closing in, a deadly race around the globe begins. Confronted by a mysterious, all-powerful enemy, Ethan must consider that nothing can matter more than his mission – not even the lives of those he cares about most.",
                "https://www.movienewsletters.net/photos/347963R1.jpg",
                "Director: Christopher McQuarrie",
                "Time: 164 minutes",
                "Category: Thriller , Action ",
                "Performer: Tom Cruise, Vanessa Kirby, Rebecca Ferguson, Pom Klementieff, Hayley Atwell, Cary Elwes, Simon Pegg, ...  "
            ),
            Phim(
                "SKINAMARINK",
                "Two children wake up in the middle of the night to find their father is missing, and all the windows and doors in their home have vanished.",
                "https://cdn.shopify.com/s/files/1/0359/2201/8348/files/81xEb2XMB_L._SL1500_661e0d9b-1485-443b-8517-d22fd68dc93a.jpg?v=1686836881",
                "Director: Kyle Edward Ball",
                "Time: 100 minutes ",
                "Category: Movie Ghost - Horror",
                "Performer:Jaime Hill , Lucas Paul , Ross Paul , ..."
            ),
            Phim(
                "BED REST",
                "A pregnant woman on bed rest begins to wonder if her house is haunted or if it's all in her head.",
                "https://www.themoviedb.org/t/p/w500/tiZF8b9T9fMcwvsEEkJ5ik1wCnV.jpg",
                "Director: Lori Evans Taylor",
                "Time: 90minutes ",
                "Category: drama, Horror, Mystery",
                "Performer: Melissa Barrera, Guy Burnet, Edie Inksetter, Sebastian Billingsley-Rodriguez, Erik Athavale, Kristen Sawatzky,... "
            ),
            Phim(
                "SISU",
                "Deep in the wilderness of Lapland, Aatami Korpi is searching for gold but after he stumbles upon Nazi patrol, a breathtaking and gold-hungry chase through the destroyed and mined Lapland wilderness begins.",
                "https://pbs.twimg.com/media/Fv6jr4NWYAo05Yi.jpg",
                "Director: Jalmari Helander",
                "Time: 91 minutes ",
                "Category: War , Action",
                "Performer:Jorma Tommila, Axel Hennie, Jack Doolan, Mimosa Willamo, Good luck Tommi, Arttu Kapulainen, ..."
            ),
            Phim(
                "GUY RITCHIE'S THE CONVENANT",
                "During the war in Afghanistan, a local interpreter risks his own life to carry an injured sergeant across miles of grueling terrain.",
                "https://m.media-amazon.com/images/M/MV5BNmQzOWZhOTMtZTcxNC00MTdkLWEwYmUtOWVmOTFhNTdkNjRkXkEyXkFqcGdeQXVyODk2NDQ3MTA@._V1_FMjpg_UX1000_.jpg",
                "Director: Guy Ritchie",
                "Time: 123 minutes",
                "Category: Action , Drama , Crime ",
                "Performer: Jake Gyllenhaal, Alexander Ludwig, Antony Starr, Emily Beecham, Dar Salim, Jason Wong, Bobby Schofield, ..."
            ),
            Phim(
                "THE POPE'S EXORCIST",
                "Father Gabriele Amorth, Chief Exorcist of the Vatican, investigates a young boy's terrifying possession and ends up uncovering a centuries-old conspiracy the Vatican has desperately tried to keep hidden.",
                "https://m.media-amazon.com/images/M/MV5BYjA0MGU4MzYtYTYxMy00MjRhLTlmMDYtZTVhZDc1Y2QwNWY2XkEyXkFqcGdeQXVyMjY5ODI4NDk@._V1_FMjpg_UX1000_.jpg",
                "Director: Julius Avery",
                "Time: 103 minutes",
                "Category: Horror, Thriller ",
                "Performer: Russell Crowe, Daniel Zovatto, Alex Essoe, Franco Nero, Peter DeSouza-Feighoney, Laurel Marsden, Cornell John, ... "
            ),
            Phim(
                "TOTAL RECALL ",
                "A factory worker, Douglas Quaid, begins to suspect that he is a spy after visiting Rekall - a company that provides its clients with implanted fake memories of a life they would like to have led - goes wrong and he finds himself on the run. ",
                "https://m.media-amazon.com/images/M/MV5BN2ZiMDMzYWItNDllZC00ZmRmLWI1YzktM2M5M2ZmZDg1OGNlXkEyXkFqcGdeQXVyNDQ2MTMzODA@._V1_.jpg",
                "Director: Len Wiseman",
                "Time: 118 minutes",
                "Category: Action, adventure, sci-fi  ",
                "Performer: Colin Farrell, Kate Beckinsale, Jessica Biel, Bryan Cranston, Bokeem Woodbine, Bill Nighy, ...   "
            ),
            Phim(
                "THE FLASH ",
                "When his attempt to save his family inadvertently alters the future, Barry Allen becomes trapped in a reality in which General Zod has returned and there are no Super Heroes to turn to. In order to save the world that he is in and return to the future that he knows, Barry's only hope is to race for his life. But will making the ultimate sacrifice be enough to reset the universe?",
                "https://th.bing.com/th/id/R.45a1435267edb3bf1ad46c22748f744e?rik=5NPUriT8%2bqNbxA&riu=http%3a%2f%2fwww.rirca.es%2fwp-content%2fuploads%2f2017%2f02%2fFLA2_KeyArt.jpg&ehk=OLj8OZzelrqXHeBMnqAwd8mcjps%2bJ48lrqMxZbfjcmM%3d&risl=&pid=ImgRaw&r=0",
                "Director: James Gunn",
                "Time: 144minutes ",
                "Category: Fiction, Mythology, Adventure, Action ",
                "Performer: Ben Affleck, Ezra Miller, ..."
            ),
        )
    }
}

