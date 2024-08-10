package com.example.monapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.json.JSONException;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        returnButton = (Button) findViewById(R.id.activity_detail_return_button);

        String jsonData = "[{\"id\":1,\"title\":\"Classic Comfort Drawstring Joggers\",\"price\":\"79\",\"category\":\"updatedClothes\",\"description\":\"Experience the perfect blend of comfort and style with our Classic Comfort Drawstring Joggers. Designed for a relaxed fit, these joggers feature a soft, stretchable fabric, convenient side pockets, and an adjustable drawstring waist with elegant gold-tipped detailing. Ideal for lounging or running errands, these pants will quickly become your go-to for effortless, casual wear.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/mp3rUty.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":2,\"title\":\"Classic Red Jogger Sweatpants\",\"price\":\"98\",\"category\":\"updatedClothes\",\"description\":\"Experience ultimate comfort with our red jogger sweatpants, perfect for both workout sessions and lounging around the house. Made with soft, durable fabric, these joggers feature a snug waistband, adjustable drawstring, and practical side pockets for functionality. Their tapered design and elastic cuffs offer a modern fit that keeps you looking stylish on the go.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/9LFjwpI.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":3,\"title\":\"Classic Navy Blue Baseball Cap\",\"price\":\"61\",\"category\":\"updatedClothes\",\"description\":\"Step out in style with this sleek navy blue baseball cap. Crafted from durable material, it features a smooth, structured design and an adjustable strap for the perfect fit. Protect your eyes from the sun and complement your casual looks with this versatile and timeless accessory.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/R3iobJA.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":4,\"title\":\"Classic Blue Baseball Cap\",\"price\":\"86\",\"category\":\"updatedClothes\",\"description\":\"Top off your casual look with our Classic Blue Baseball Cap, made from high-quality materials for lasting comfort. Featuring a timeless six-panel design with a pre-curved visor, this adjustable cap offers both style and practicality for everyday wear.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/wXuQ7bm.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":5,\"title\":\"Classic Red Baseball Cap\",\"price\":\"35\",\"category\":\"updatedClothes\",\"description\":\"Elevate your casual wardrobe with this timeless red baseball cap. Crafted from durable fabric, it features a comfortable fit with an adjustable strap at the back, ensuring one size fits all. Perfect for sunny days or adding a sporty touch to your outfit.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/cBuLvBi.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":6,\"title\":\"Classic Black Baseball Cap\",\"price\":\"58\",\"category\":\"updatedClothes\",\"description\":\"Elevate your casual wear with this timeless black baseball cap. Made with high-quality, breathable fabric, it features an adjustable strap for the perfect fit. Whether you\\u2019re out for a jog or just running errands, this cap adds a touch of style to any outfit.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/KeqG6r4.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":7,\"title\":\"Updated Classic High-Waisted Athletic Shorts\",\"price\":\"43\",\"category\":\"updatedClothes\",\"description\":\"Stay comfortable and stylish aja\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"[\\\"https:\\/\\/i.imgur.com\\/QkIa5tT.jpeg\\\"]\",\"created_at\":null,\"updated_at\":null},{\"id\":8,\"title\":\"Classic White Crew Neck T-Shirt\",\"price\":\"39\",\"category\":\"updatedClothes\",\"description\":\"Elevate your basics with this versatile white crew neck tee. Made from a soft, breathable cotton blend, it offers both comfort and durability. Its sleek, timeless design ensures it pairs well with virtually any outfit. Ideal for layering or wearing on its own, this t-shirt is a must-have staple for every wardrobe.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/axsyGpD.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":9,\"title\":\"Classic White Tee - Timeless Style and Comfort\",\"price\":\"73\",\"category\":\"updatedClothes\",\"description\":\"Elevate your everyday wardrobe with our Classic White Tee. Crafted from premium soft cotton material, this versatile t-shirt combines comfort with durability, perfect for daily wear. Featuring a relaxed, unisex fit that flatters every body type, it's a staple piece for any casual ensemble. Easy to care for and machine washable, this white tee retains its shape and softness wash after wash. Pair it with your favorite jeans or layer it under a jacket for a smart look.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/Y54Bt8J.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":10,\"title\":\"Classic Black T-Shirt\",\"price\":\"35\",\"category\":\"updatedClothes\",\"description\":\"Elevate your everyday style with our Classic Black T-Shirt. This staple piece is crafted from soft, breathable cotton for all-day comfort. Its versatile design features a classic crew neck and short sleeves, making it perfect for layering or wearing on its own. Durable and easy to care for, it's sure to become a favorite in your wardrobe.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/9DqEOV5.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":11,\"title\":\"Sleek Wireless Headphone & Inked Earbud Set\",\"price\":\"44\",\"category\":\"Electronics\",\"description\":\"Experience the fusion of style and sound with this sophisticated audio set featuring a pair of sleek, white wireless headphones offering crystal-clear sound quality and over-ear comfort. The set also includes a set of durable earbuds, perfect for an on-the-go lifestyle. Elevate your music enjoyment with this versatile duo, designed to cater to all your listening needs.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/yVeIeDa.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":12,\"title\":\"Sleek Comfort-Fit Over-Ear Headphones\",\"price\":\"28\",\"category\":\"Electronics\",\"description\":\"Experience superior sound quality with our Sleek Comfort-Fit Over-Ear Headphones, designed for prolonged use with cushioned ear cups and an adjustable, padded headband. Ideal for immersive listening, whether you're at home, in the office, or on the move. Their durable construction and timeless design provide both aesthetically pleasing looks and long-lasting performance.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/SolkFEB.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":13,\"title\":\"Efficient 2-Slice Toaster\",\"price\":\"48\",\"category\":\"Electronics\",\"description\":\"Enhance your morning routine with our sleek 2-slice toaster, featuring adjustable browning controls and a removable crumb tray for easy cleaning. This compact and stylish appliance is perfect for any kitchen, ensuring your toast is always golden brown and delicious.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/keVCVIa.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":14,\"title\":\"Sleek Wireless Computer Mouse\",\"price\":\"10\",\"category\":\"Electronics\",\"description\":\"Experience smooth and precise navigation with this modern wireless mouse, featuring a glossy finish and a comfortable ergonomic design. Its responsive tracking and easy-to-use interface make it the perfect accessory for any desktop or laptop setup. The stylish blue hue adds a splash of color to your workspace, while its compact size ensures it fits neatly in your bag for on-the-go productivity.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/w3Y8NwQ.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":15,\"title\":\"Sleek Modern Laptop with Ambient Lighting\",\"price\":\"43\",\"category\":\"Electronics\",\"description\":\"Experience next-level computing with our ultra-slim laptop, featuring a stunning display illuminated by ambient lighting. This high-performance machine is perfect for both work and play, delivering powerful processing in a sleek, portable design. The vibrant colors add a touch of personality to your tech collection, making it as stylish as it is functional.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/OKn1KFI.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":16,\"title\":\"Sleek Modern Laptop for Professionals\",\"price\":\"97\",\"category\":\"Electronics\",\"description\":\"Experience cutting-edge technology and elegant design with our latest laptop model. Perfect for professionals on-the-go, this high-performance laptop boasts a powerful processor, ample storage, and a long-lasting battery life, all encased in a lightweight, slim frame for ultimate portability. Shop now to elevate your work and play.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/ItHcq7o.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":17,\"title\":\"Stylish Red & Silver Over-Ear Headphones\",\"price\":\"39\",\"category\":\"Electronics\",\"description\":\"Immerse yourself in superior sound quality with these sleek red and silver over-ear headphones. Designed for comfort and style, the headphones feature cushioned ear cups, an adjustable padded headband, and a detachable red cable for easy storage and portability. Perfect for music lovers and audiophiles who value both appearance and audio fidelity.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/YaSqa06.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":18,\"title\":\"Sleek Mirror Finish Phone Case\",\"price\":\"27\",\"category\":\"Electronics\",\"description\":\"Enhance your smartphone's look with this ultra-sleek mirror finish phone case. Designed to offer style with protection, the case features a reflective surface that adds a touch of elegance while keeping your device safe from scratches and impacts. Perfect for those who love a minimalist and modern aesthetic.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/yb9UQKL.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":19,\"title\":\"Sleek Smartwatch with Vibrant Display\",\"price\":\"16\",\"category\":\"Electronics\",\"description\":\"Experience modern timekeeping with our high-tech smartwatch, featuring a vivid touch screen display, customizable watch faces, and a comfortable blue silicone strap. This smartwatch keeps you connected with notifications and fitness tracking while showcasing exceptional style and versatility.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/LGk9Jn2.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":20,\"title\":\"Sleek Modern Leather Sofa\",\"price\":\"53\",\"category\":\"Furniture\",\"description\":\"Enhance the elegance of your living space with our Sleek Modern Leather Sofa. Designed with a minimalist aesthetic, it features clean lines and a luxurious leather finish. The robust metal legs provide stability and support, while the plush cushions ensure comfort. Perfect for contemporary homes or office waiting areas, this sofa is a statement piece that combines style with practicality.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/Qphac99.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":21,\"title\":\"Mid-Century Modern Wooden Dining Table\",\"price\":\"24\",\"category\":\"Furniture\",\"description\":\"Elevate your dining room with this sleek Mid-Century Modern dining table, featuring an elegant walnut finish and tapered legs for a timeless aesthetic. Its sturdy wood construction and minimalist design make it a versatile piece that fits with a variety of decor styles. Perfect for intimate dinners or as a stylish spot for your morning coffee.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/DMQHGA0.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":22,\"title\":\"Elegant Golden-Base Stone Top Dining Table\",\"price\":\"66\",\"category\":\"Furniture\",\"description\":\"Elevate your dining space with this luxurious table, featuring a sturdy golden metal base with an intricate rod design that provides both stability and chic elegance. The smooth stone top in a sleek round shape offers a robust surface for your dining pleasure. Perfect for both everyday meals and special occasions, this table easily complements any modern or glam decor.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/NWIJKUj.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":23,\"title\":\"Modern Elegance Teal Armchair\",\"price\":\"25\",\"category\":\"Furniture\",\"description\":\"Elevate your living space with this beautifully crafted armchair, featuring a sleek wooden frame that complements its vibrant teal upholstery. Ideal for adding a pop of color and contemporary style to any room, this chair provides both superb comfort and sophisticated design. Perfect for reading, relaxing, or creating a cozy conversation nook.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/6wkyyIN.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":24,\"title\":\"Elegant Solid Wood Dining Table\",\"price\":\"67\",\"category\":\"Furniture\",\"description\":\"Enhance your dining space with this sleek, contemporary dining table, crafted from high-quality solid wood with a warm finish. Its sturdy construction and minimalist design make it a perfect addition for any home looking for a touch of elegance. Accommodates up to six guests comfortably and includes a striking fruit bowl centerpiece. The overhead lighting is not included.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/4lTaHfF.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":25,\"title\":\"Modern Minimalist Workstation Setup\",\"price\":\"49\",\"category\":\"Furniture\",\"description\":\"Elevate your home office with our Modern Minimalist Workstation Setup, featuring a sleek wooden desk topped with an elegant computer, stylish adjustable wooden desk lamp, and complimentary accessories for a clean, productive workspace. This setup is perfect for professionals seeking a contemporary look that combines functionality with design.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/3oXNBst.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":26,\"title\":\"Modern Ergonomic Office Chair\",\"price\":\"71\",\"category\":\"Furniture\",\"description\":\"Elevate your office space with this sleek and comfortable Modern Ergonomic Office Chair. Designed to provide optimal support throughout the workday, it features an adjustable height mechanism, smooth-rolling casters for easy mobility, and a cushioned seat for extended comfort. The clean lines and minimalist white design make it a versatile addition to any contemporary workspace.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/3dU0m72.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":27,\"title\":\"Futuristic Holographic Soccer Cleats\",\"price\":\"39\",\"category\":\"Shoes\",\"description\":\"Step onto the field and stand out from the crowd with these eye-catching holographic soccer cleats. Designed for the modern player, these cleats feature a sleek silhouette, lightweight construction for maximum agility, and durable studs for optimal traction. The shimmering holographic finish reflects a rainbow of colors as you move, ensuring that you'll be noticed for both your skills and style. Perfect for the fashion-forward athlete who wants to make a statement.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/qNOjJje.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":28,\"title\":\"Rainbow Glitter High Heels\",\"price\":\"39\",\"category\":\"Shoes\",\"description\":\"Step into the spotlight with these eye-catching rainbow glitter high heels. Designed to dazzle, each shoe boasts a kaleidoscope of shimmering colors that catch and reflect light with every step. Perfect for special occasions or a night out, these stunners are sure to turn heads and elevate any ensemble.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/62gGzeF.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":29,\"title\":\"Chic Summer Denim Espadrille Sandals\",\"price\":\"33\",\"category\":\"Shoes\",\"description\":\"Step into summer with style in our denim espadrille sandals. Featuring a braided jute sole for a classic touch and adjustable denim straps for a snug fit, these sandals offer both comfort and a fashionable edge. The easy slip-on design ensures convenience for beach days or casual outings.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/9qrmE1b.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":30,\"title\":\"Vibrant Runners: Bold Orange & Blue Sneakers\",\"price\":\"27\",\"category\":\"Shoes\",\"description\":\"Step into style with these eye-catching sneakers featuring a striking combination of orange and blue hues. Designed for both comfort and fashion, these shoes come with flexible soles and cushioned insoles, perfect for active individuals who don't compromise on style. The reflective silver accents add a touch of modernity, making them a standout accessory for your workout or casual wear.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/hKcMNJs.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":31,\"title\":\"Vibrant Pink Classic Sneakers\",\"price\":\"84\",\"category\":\"Shoes\",\"description\":\"Step into style with our Vibrant Pink Classic Sneakers! These eye-catching shoes feature a bold pink hue with iconic white detailing, offering a sleek, timeless design. Constructed with durable materials and a comfortable fit, they are perfect for those seeking a pop of color in their everyday footwear. Grab a pair today and add some vibrancy to your step!\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/mcW42Gi.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":32,\"title\":\"Futuristic Silver and Gold High-Top Sneaker\",\"price\":\"68\",\"category\":\"Shoes\",\"description\":\"Step into the future with this eye-catching high-top sneaker, designed for those who dare to stand out. The sneaker features a sleek silver body with striking gold accents, offering a modern twist on classic footwear. Its high-top design provides support and style, making it the perfect addition to any avant-garde fashion collection. Grab a pair today and elevate your shoe game!\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/npLfCGq.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":33,\"title\":\"Futuristic Chic High-Heel Boots\",\"price\":\"36\",\"category\":\"Shoes\",\"description\":\"Elevate your style with our cutting-edge high-heel boots that blend bold design with avant-garde aesthetics. These boots feature a unique color-block heel, a sleek silhouette, and a versatile light grey finish that pairs easily with any cutting-edge outfit. Crafted for the fashion-forward individual, these boots are sure to make a statement.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/HqYqLnW.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":34,\"title\":\"Elegant Patent Leather Peep-Toe Pumps with Gold-Tone Heel\",\"price\":\"53\",\"category\":\"Shoes\",\"description\":\"Step into sophistication with these chic peep-toe pumps, showcasing a lustrous patent leather finish and an eye-catching gold-tone block heel. The ornate buckle detail adds a touch of glamour, perfect for elevating your evening attire or complementing a polished daytime look.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/AzAY4Ed.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":35,\"title\":\"Elegant Purple Leather Loafers\",\"price\":\"17\",\"category\":\"Shoes\",\"description\":\"Step into sophistication with our Elegant Purple Leather Loafers, perfect for making a bold statement. Crafted from high-quality leather with a vibrant purple finish, these shoes feature a classic loafer silhouette that's been updated with a contemporary twist. The comfortable slip-on design and durable soles ensure both style and functionality for the modern man.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/Au8J9sX.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":36,\"title\":\"Classic Blue Suede Casual Shoes\",\"price\":\"39\",\"category\":\"Shoes\",\"description\":\"Step into comfort with our Classic Blue Suede Casual Shoes, perfect for everyday wear. These shoes feature a stylish blue suede upper, durable rubber soles for superior traction, and classic lace-up fronts for a snug fit. The sleek design pairs well with both jeans and chinos, making them a versatile addition to any wardrobe.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/sC0ztOB.jpeg\",\"created_at\":null,\"updated_at\":null},{\"id\":37,\"title\":\"Sleek Futuristic Electric Bicycle\",\"price\":\"22\",\"category\":\"Miscellaneous\",\"description\":\"This modern electric bicycle combines style and efficiency with its unique design and top-notch performance features. Equipped with a durable frame, enhanced battery life, and integrated tech capabilities, it's perfect for the eco-conscious commuter looking to navigate the city with ease.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/BG8J0Fj.jpg\",\"created_at\":null,\"updated_at\":null},{\"id\":38,\"title\":\"Sleek All-Terrain Go-Kart\",\"price\":\"37\",\"category\":\"Miscellaneous\",\"description\":\"Experience the thrill of outdoor adventures with our Sleek All-Terrain Go-Kart, featuring a durable frame, comfortable racing seat, and robust, large-tread tires perfect for handling a variety of terrains. Designed for fun-seekers of all ages, this go-kart is an ideal choice for backyard racing or exploring local trails.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/Ex5x3IU.jpg\",\"created_at\":null,\"updated_at\":null},{\"id\":39,\"title\":\"Radiant Citrus Eau de Parfum\",\"price\":\"73\",\"category\":\"Miscellaneous\",\"description\":\"Indulge in the essence of summer with this vibrant citrus-scented Eau de Parfum. Encased in a sleek glass bottle with a bold orange cap, this fragrance embodies freshness and elegance. Perfect for daily wear, it's an olfactory delight that leaves a lasting, zesty impression.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/xPDwUb3.jpg\",\"created_at\":null,\"updated_at\":null},{\"id\":40,\"title\":\"Sleek Olive Green Hardshell Carry-On Luggage\",\"price\":\"48\",\"category\":\"Miscellaneous\",\"description\":\"Travel in style with our durable hardshell carry-on, perfect for weekend getaways and business trips. This sleek olive green suitcase features smooth gliding wheels for easy airport navigation, a sturdy telescopic handle, and a secure zippered compartment to keep your belongings safe. Its compact size meets most airline overhead bin requirements, ensuring a hassle-free flying experience.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/jVfoZnP.jpg\",\"created_at\":null,\"updated_at\":null},{\"id\":41,\"title\":\"Chic Transparent Fashion Handbag\",\"price\":\"61\",\"category\":\"Miscellaneous\",\"description\":\"Elevate your style with our Chic Transparent Fashion Handbag, perfect for showcasing your essentials with a clear, modern edge. This trendy accessory features durable acrylic construction, luxe gold-tone hardware, and an elegant chain strap. Its compact size ensures you can carry your day-to-day items with ease and sophistication.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/Lqaqz59.jpg\",\"created_at\":null,\"updated_at\":null},{\"id\":42,\"title\":\"Trendy Pink-Tinted Sunglasses\",\"price\":\"38\",\"category\":\"Miscellaneous\",\"description\":\"Step up your style game with these fashionable black-framed, pink-tinted sunglasses. Perfect for making a statement while protecting your eyes from the glare. Their bold color and contemporary design make these shades a must-have accessory for any trendsetter looking to add a pop of color to their ensemble.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/0qQBkxX.jpg\",\"created_at\":null,\"updated_at\":null},{\"id\":43,\"title\":\"Elegant Glass Tumbler Set\",\"price\":\"50\",\"category\":\"Miscellaneous\",\"description\":\"Enhance your drinkware collection with our sophisticated set of glass tumblers, perfect for serving your favorite beverages. This versatile set includes both clear and subtly tinted glasses, lending a modern touch to any table setting. Crafted with quality materials, these durable tumblers are designed to withstand daily use while maintaining their elegant appeal.\",\"publicationDate\":\"2024-08-04 18:09:36\",\"image\":\"https:\\/\\/i.imgur.com\\/TF0pXdL.jpg\",\"created_at\":null,\"updated_at\":null},{\"id\":44,\"title\":\" Luxury men watches Brand Mr.Karim\",\"price\":\"67980\",\"category\":\"Electronics\",\"description\":\"it's too match to you try agine baby\",\"publicationDate\":\"2024-08-04 22:18:46\",\"image\":\"[\\\"https:\\/\\/imgur.com\\/VKjVhFL.jpeg\\\"]\",\"created_at\":null,\"updated_at\":null},{\"id\":45,\"title\":\"New Product\",\"price\":\"10\",\"category\":\"updatedClothes\",\"description\":\"A description\",\"publicationDate\":\"2024-08-04 23:11:40\",\"image\":\"[\\\"https:\\/\\/i.imgur.com\\/QkIa5tT.jpeg\\\"]\",\"created_at\":null,\"updated_at\":null},{\"id\":46,\"title\":\"New Product Course\",\"price\":\"999\",\"category\":\"updatedClothes\",\"description\":\"A description\",\"publicationDate\":\"2024-08-05 02:26:24\",\"image\":\"[\\\"https:\\/\\/placeimg.com\\/640\\/480\\/any\\\"]\",\"created_at\":null,\"updated_at\":null},{\"id\":47,\"title\":\"New Product Course\",\"price\":\"999\",\"category\":\"updatedClothes\",\"description\":\"A description\",\"publicationDate\":\"2024-08-05 02:26:54\",\"image\":\"[\\\"https:\\/\\/placeimg.com\\/640\\/480\\/any\\\"]\",\"created_at\":null,\"updated_at\":null},{\"id\":48,\"title\":\"New Product Course\",\"price\":\"999\",\"category\":\"updatedClothes\",\"description\":\"A description\",\"publicationDate\":\"2024-08-05 02:31:24\",\"image\":\"[\\\"https:\\/\\/placeimg.com\\/640\\/480\\/any\\\"]\",\"created_at\":null,\"updated_at\":null},{\"id\":49,\"title\":\"T-Shirt\",\"price\":\"299000\",\"category\":\"Electronics\",\"description\":\"Kaos aja kedua.\",\"publicationDate\":\"2024-08-05 03:49:34\",\"image\":\"[\\\"https:\\/\\/th.bing.com\\/th\\/id\\/OIP.d0xkRHUq3dMtfvwCMNQX5gHaHa?rs=1&pid=ImgDetMain\\\"]\",\"created_at\":null,\"updated_at\":null},{\"id\":50,\"title\":\"Chandan\",\"price\":\"29\",\"category\":\"Miscellaneous\",\"description\":\"This is chandan from India\",\"publicationDate\":\"2024-08-05 04:50:52\",\"image\":\"[\\\"https:\\/\\/firebasestorage.googleapis.com\\/v0\\/b\\/storagemanager-df23d.appspot.com\\/o\\/products%2F1722833449422?alt=media&token=969f6f1f-9a22-4e3d-bcb3-2d1879c31063\\\"]\",\"created_at\":null,\"updated_at\":null},{\"id\":51,\"title\":\"Sample Product\",\"price\":\"99\",\"category\":\"updatedClothes\",\"description\":\"This is a sample product for testing purposes.\",\"publicationDate\":\"2024-08-05 05:21:07\",\"image\":\"[\\\"https:\\/\\/example.com\\/image1.jpg\\\"\",\"created_at\":null,\"updated_at\":null},{\"id\":52,\"title\":\"adasdad\",\"price\":\"123\",\"category\":\"updatedClothes\",\"description\":\"adassad\",\"publicationDate\":\"2024-08-05 05:24:05\",\"image\":\"[\\\"https:\\/\\/firebasestorage.googleapis.com\\/v0\\/b\\/storagemanager-df23d.appspot.com\\/o\\/products%2F1722835442561?alt=media&token=881ddfd2-0a9f-47db-93d3-55b2ca4dc963\\\"]\",\"created_at\":null,\"updated_at\":null},{\"id\":53,\"title\":\"adasdasdadasdasd\",\"price\":\"131\",\"category\":\"Miscellaneous\",\"description\":\"dadadasdd\",\"publicationDate\":\"2024-08-05 05:25:49\",\"image\":\"[\\\"https:\\/\\/firebasestorage.googleapis.com\\/v0\\/b\\/storagemanager-df23d.appspot.com\\/o\\/products%2F1722835546729?alt=media&token=4c22990c-35ac-4bd1-938a-9bc92eb99cb8\\\"]\",\"created_at\":null,\"updated_at\":null},{\"id\":54,\"title\":\"adasdasasdas\",\"price\":\"12\",\"category\":\"Shoes\",\"description\":\"dada\",\"publicationDate\":\"2024-08-05 05:48:50\",\"image\":\"[\\\"https:\\/\\/firebasestorage.googleapis.com\\/v0\\/b\\/storagemanager-df23d.appspot.com\\/o\\/products%2F1722836927156?alt=media&token=9e1884d0-9ae6-4004-ab0d-abefcedb3481\\\"]\",\"created_at\":null,\"updated_at\":null},{\"id\":55,\"title\":\"New Product\",\"price\":\"10\",\"category\":\"updatedClothes\",\"description\":\"2\",\"publicationDate\":\"2024-08-05 06:03:52\",\"image\":\"[\\\"https:\\/\\/placeimg.com\\/640\\/480\\/any\\\"]\",\"created_at\":null,\"updated_at\":null},{\"id\":56,\"title\":\"chai waa\",\"price\":\"23\",\"category\":\"updatedClothes\",\"description\":\"adasd\",\"publicationDate\":\"2024-08-05 06:14:47\",\"image\":\"[\\\"https:\\/\\/firebasestorage.googleapis.com\\/v0\\/b\\/storagemanager-df23d.appspot.com\\/o\\/products%2F1722838483905?alt=media&token=749a0d2a-8fed-4971-8f52-8ede9e10811f\\\"]\",\"created_at\":null,\"updated_at\":null},{\"id\":57,\"title\":\"asdadasd\",\"price\":\"123\",\"category\":\"updatedClothes\",\"description\":\"asdadas\",\"publicationDate\":\"2024-08-05 06:21:42\",\"image\":\"[\\\"https:\\/\\/firebasestorage.googleapis.com\\/v0\\/b\\/storagemanager-df23d.appspot.com\\/o\\/products%2F1722838899497?alt=media&token=a640acfc-904d-4797-9e5a-b452cdc48bfa\\\"]\",\"created_at\":null,\"updated_at\":null},{\"id\":58,\"title\":\"asdadsasa\",\"price\":\"42\",\"category\":\"updatedClothes\",\"description\":\"qadasd\",\"publicationDate\":\"2024-08-05 06:26:10\",\"image\":\"[\\\"https:\\/\\/firebasestorage.googleapis.com\\/v0\\/b\\/storagemanager-df23d.appspot.com\\/o\\/products%2F1722839167283?alt=media&token=78832d02-d979-4b4a-8446-fb9b4cd8bf75\\\"]\",\"created_at\":null,\"updated_at\":null}]";

        try {
            List<Item> itemList = JsonParser.parseJson(jsonData);
            ItemAdapter adapter = new ItemAdapter(this, itemList);
            recyclerView.setAdapter(adapter);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked

                Intent mainActivity = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });
    }
}
