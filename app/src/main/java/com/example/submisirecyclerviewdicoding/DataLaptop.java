package com.example.submisirecyclerviewdicoding;

import java.util.ArrayList;

public class DataLaptop {

private static String LaptopName[] ={
        "Razer Blade 2019",
        "Macbook Pro 2019",
        "HP Omen 15",
        "Lenovo Y720",
        "Lenovo Thinkpad Yoga370",
        "Asus Zenbook Pro 14",
        "Acer Predator Triton 500",
        "Microsoft Surface 3",
        "Aftershock S-15",
        "Google Pixelbook 2"
};
private static  String price[]={
        "3,200$",
        "3,499$",
        "$1,299",
        "$1,399",
        "$1,389",
        "$1,599",
        "$1,799",
        "$999",
        "$2,158",
        "$1,000"

};

private  static int LaptopImage[]={
        R.drawable.razerblade,
        R.drawable.macbook,
        R.drawable.hpomen,
        R.drawable.y720,
        R.drawable.thinkpad,
        R.drawable.zenbook,
        R.drawable.predator_triton,
        R.drawable.surface,
        R.drawable.aftershock,
        R.drawable.pixelbook
    };

private static String LaptopDescription[]={
             "Proccesor: Intel Core i7-8750H\n" +
                     "Graphics: Nvidia GeForce RTX 2080 6GB\n" +
                     "RAM: 16GB DDR4(2,667Mhz)\n" +
                     "Screen: 15.6-Inch FHD MATE(1920X1080)\n" +
                     "Storage:512GB SSD(NVME PCIe 3.0x4)\n" +
                     "Ports: 1x ThunderBold,3x USB 3.1, 1x HDMI 2,0, Headphone Jack" +
                     "OS: WIndows 10 Home\n",
        "Proccesor: Intel Core i9-8750H\n" +
                "Graphics: Radeon Pro 560x\n 2x2" +
                "RAM: 32GB DDR4(2,400Mhz)\n" +
                "Screen: 15.4-Inch IPS(1920X1200)\n" +
                "Storage:512GB SSD(NVME PCIe 3.0x4)\n" +
                "Ports: 1x ThunderBold,3x USB C, 1x DisplayPort, Headphone Jack" +
                "Battery: Up to 30 hours Standby\n" +
                "OS: MacOS Mjv288\n",
        "Proccesor: Intel Core i7-7700HQ\n" +
                "Graphics: Nvidia GeForce GTX 1050TI 4GB\n" +
                "RAM: 16GB DDR4(2,667Mhz)\n" +
                "Screen: 15.6-Inch IPS(1920X1080)\n" +
                "Storage:128GB SSD(NVME PCIe 3.0x4)\n" +
                "Ports: 1x ThunderBold,3x USB 3.1, 1x HDMI 2,0, Headphone Jack" +
                "OS: Windows 10 Home",
        "Proccesor: Intel Core i7-7700HQ\n" +
                "Graphics: Nvidia GeForce GTX 1060 6B\n" +
                "RAM: 16GB DDR4(2,667Mhz)\n" +
                "Screen: 15.6-Inch FHD MATE(1920X1080)\n" +
                "Storage:512GB SSD(NVME PCIe 3.0x4)\n" +
                "Ports: 1x ThunderBold,3x 4xUSB 3.1, 2x HDMI 2,0, Headphone Jack,RJ45,DisplayPort\n" +
                "OS: Windows 10 Home\n",
        "Proccesor: Intel Core 15-7200U\n" +
                "Graphics: Intel HD 620\n" +
                "RAM: 8GB DDR4(2,667Mhz)\n" +
                "Screen: 13.3-Inch IPS(1920X1080)\n" +
                "Storage:256GB SSD(NVME PCIe 3.0x4)\n" +
                "Ports: 1x ThunderBold,3x 4xUSB 3.1, 2x HDMI 2,0, Headphone Jack,RJ45,DisplayPort\n" +
                "OS: Windows 10 Home\n",
        "Proccesor: Intel Core i7-8565U\n" +
                "Graphics: Nvidia GeForce GTX 1050 MAX Q 2B\n" +
                "RAM: 8GB DDR4(2,667Mhz)\n" +
                "Screen: 14.0-Inch FHD(1920X1080)\n" +
                "Storage:256GB SSD(NVME PCIe 3.0x4)\n" +
                "Ports: 1x ThunderBold,3x 4xUSB 3.1, 2x HDMI 2,0, Headphone Jack,RJ45,DisplayPort\n" +
                "OS: Windows 10 Pro\n",
        "Proccesor: Intel Core i7-8750H\n" +
                "Graphics: Nvidia GeForce RTX 20606B\n" +
                "RAM: 16 DDR4(Dual Channel)\n" +
                "Screen: 15.6-Inch FHD(1920X1080)\n" +
                "Storage:512GB SSD(NVME PCIe 3.0x4)\n" +
                "Ports: 1x ThunderBold,3x 4xUSB 3.1, 1xHDMI 2,0, Headphone Jack,RJ45,DisplayPort\n" +
                "OS: Windows 10 Pro\n",
        "Proccesor: Intel Core i5-4300U\n" +
                "Graphics: Intel HD 4400\n" +
                "RAM: 8GB LPDDR3\n" +
                "Screen: 12.0-Inch FHD(2160x1440)\n" +
                "Storage:256GB SSD(NVME PCIe 3.0x4)\n" +
                "Ports: 3xUSB 3.1, Headphone Jack,RJ45,DisplayPort\n" +
                "OS: Windows 10 Pro\n",
        "Proccesor: Intel Core i7-6700HQ\n" +
                "Graphics: Nvidia GeForce GTX 970M 3B\n" +
                "RAM: 8GB DDR4(2,667Mhz)\n" +
                "Screen: 15.6-Inch FHD(1920X1080)\n" +
                "Storage:120GB SSD(NVME PCIe 3.0x4) + 1TB HDD\n" +
                "Ports: 1x ThunderBold,3x 4xUSB 3.1, 2x HDMI 2,0, Headphone Jack,RJ45,DisplayPort\n" +
                "OS: Windows 10 Pro\n",
        "Proccesor: Intel Core i5-Y575\n" +
                "Graphics: Intel HD 615" +
                "RAM: 8GB LPDDR3\n" +
                "Screen: 12.3-Inch QHD(2400X1600)\n" +
                "Storage:256GB SSD(NVME PCIe 3.0x4)\n" +
                "Ports: 1x ThunderBold,3x 4xUSB 3.1, 2x HDMI 2,0, Headphone Jack,RJ45,DisplayPort\n" +
                "OS: Windows 10 Pro\n",
    };

static ArrayList<Laptop> getListData(){
 ArrayList<Laptop> list = new ArrayList<>();
for (int position=0;position<LaptopName.length;position++){
    Laptop laptop = new Laptop();
    laptop.setDesc(LaptopDescription[position]);
    laptop.setName(LaptopName[position]);
    laptop.setPrice(price[position]);
    laptop.setImage(LaptopImage[position]);
    list.add(laptop);

}
return list;
}


}
