package Normal;
import java.util.Arrays;

public class findTheMaximumOddNumberInArray {
    public static int  maxodd(int arr[])
    {
        int n=1;
        int x=0;
        if(arr[arr.length-n]%2==0)
        {
            n++;
        }
        else{
            x=arr[arr.length-n];
            
        }
        return x;
        
    }
    public static void main(String[] args)
    {
        int arr[]={9221, 309, 948, 920, 0, 549, 795, 0, 364, 0, 333, 295, 677, 0, 276, 876, 810, 0, 0, 543, 0, 496, 246, 325, 712, 552, 618, 612, 0, 460, 0, 770, 87, 0, 718, 0, 280, 277, 54, 0, 0, 265, 0, 361, 0, 240, 0, 0, 0, 364, 0, 396, 871, 0, 0, 420, 1, 434, 424, 789, 58, 821, 53, 96, 0, 0, 341, 875, 0, 0, 0, 911, 846, 562, 293, 0, 0, 995, 869, 0, 660, 696, 661, 882, 848, 833, 0, 161, 442, 2, 717, 516, 0, 0, 924, 668, 0, 0, 718, 682, 0, 0, 107, 0, 285, 722, 591, 202, 40, 930, 0, 0, 0, 707, 65, 0, 612, 626, 374, 686, 0, 0, 183, 635, 0, 446, 0, 166, 231, 320, 506, 859, 261, 821, 570, 615, 0, 552, 195, 419, 314, 445, 479, 0, 0, 794, 918, 0, 202, 202, 84, 956, 277, 700, 131, 489, 93, 848, 0, 673, 0, 193, 0, 0, 0, 691, 685, 0, 799, 532, 0, 0, 0, 823, 0, 281, 660, 677, 0, 0, 220, 539, 0, 0, 132, 443, 0, 0, 225, 48, 237, 0, 104, 0, 644, 519, 263, 0, 0, 538, 128, 434, 459, 479, 799, 694, 400, 156, 191, 0, 260, 270, 586, 172, 388, 0, 922, 966, 0, 806, 0, 221, 545, 0, 0, 13, 0, 709, 0, 0, 810, 114, 820, 0, 0, 0, 0, 393, 0, 0, 552, 0, 26, 78, 627, 542, 371, 929, 786, 185, 533, 329, 0, 0, 720, 0, 311, 244, 0, 379, 0, 706, 0, 147, 0, 46, 0, 970, 486, 0, 0, 954, 0, 0, 0, 136, 0, 0, 507, 394, 455, 645, 0, 0, 618, 103, 0, 0, 0, 671, 341, 49, 0, 0, 624, 433, 295, 0, 936, 127, 419, 407, 0, 330, 293, 0, 0, 0, 418, 353, 687, 766, 903, 239, 754, 957, 0, 0, 198, 0, 802, 144, 670, 0, 235, 0, 175, 412, 501, 0, 0, 0, 386, 101, 0, 937, 130, 717, 0, 735, 480, 0, 264, 313, 0, 265, 0, 122, 0, 287, 0, 0, 200, 806, 45, 116, 930, 0, 264, 0, 0, 3, 0, 0, 531, 569, 0, 0, 0, 0, 0, 921, 277, 137, 0, 0, 0, 0, 526, 0, 0, 894, 68, 203, 0, 0, 877, 0, 950, 0, 323, 847, 144, 84, 0, 129, 0, 0, 0, 0, 0, 0, 898, 0, 130, 372, 353, 0, 295, 0, 461, 443, 323, 0, 90, 443, 113, 442, 0, 0, 0, 815, 193, 0, 344, 0, 189, 0, 0, 0, 0, 0, 544, 861, 653, 0, 0, 297, 67, 611, 417, 0, 768, 786, 564, 198, 777, 378, 0, 150, 0, 0, 516, 81, 0, 289, 0, 0, 981, 0, 414, 241, 0, 0, 311, 137, 0, 868, 310, 0, 780, 254, 0, 0, 643, 871, 0, 565, 364, 786, 455, 905, 0, 0, 0, 868, 0, 0, 672, 0, 805, 49, 718, 0, 0, 799, 883, 600, 0, 848, 0, 0, 211, 0, 0, 187, 0, 919, 349, 412, 815, 548, 811, 371, 0, 48, 93, 30, 0, 487, 0, 0, 0, 0, 496, 293, 0, 936, 354, 0, 0, 0, 0, 288, 93, 0, 586, 859, 522, 0, 25, 0, 257, 794, 0, 0, 724, 818, 0, 630, 845, 30, 80, 278, 342, 601, 0, 249, 0, 251, 102, 0, 430, 418, 0, 0, 0, 0, 163, 135, 711, 683, 391, 946, 0, 208, 312, 0, 23, 754, 710, 0, 201, 117, 0, 500, 666, 0, 399, 666, 0, 0, 0, 0, 0, 0, 266, 0, 0, 0, 481, 868, 741, 0, 946, 0, 0, 0, 840, 356, 323, 0, 32, 568, 338, 561, 0, 0, 104, 0, 0, 527, 150, 0, 867, 526, 0, 480, 715, 860, 809, 756, 913, 296, 0, 687, 0, 0, 249, 602, 0, 0, 762, 489, 0, 422, 791, 984, 236, 504, 92, 0, 0, 0, 0, 60, 0, 198, 447, 0, 289, 258, 0, 303, 0, 0, 0, 0, 647, 0, 518, 0, 0, 0, 0, 0, 80, 285, 273, 0, 625, 743, 0, 264, 287, 122, 142, 510, 663, 527, 861, 828, 910, 521, 0, 902, 801, 400, 0, 0, 0, 0, 0, 699, 403, 917, 569, 594, 455, 431, 227, 221, 462, 511, 0, 0, 786, 0, 553, 901, 891, 634, 470, 77, 480, 352, 627, 47, 0, 415, 322, 706, 0, 364, 131, 53, 0, 0, 359, 0, 281, 366, 120, 389, 0, 759, 287, 0, 95, 159, 478, 964, 917, 480, 0, 0, 569, 0, 0, 217, 382, 671, 695, 0, 0, 422, 0, 332, 471, 832, 142, 0, 874, 260, 880, 0, 915, 370, 608, 0, 0, 949, 0, 142, 0, 0, 12, 601, 241, 0, 371, 242, 370, 233, 523, 835, 813, 135, 0, 186, 336, 327, 0, 0, 0, 0, 729, 914, 0, 0, 0, 0, 554, 588, 535, 0, 654, 0, 227, 0, 200, 175, 0, 0, 634, 0, 0, 500, 0, 412, 0, 0, 410, 134, 0, 825, 192, 841, 670, 0, 141, 187, 0, 446, 977, 991, 0, 154, 841, 0, 0, 762, 595, 837, 861, 659, 174, 0, 0, 0, 0, 756, 432, 188, 0, 0, 710, 355, 0, 396, 556, 0, 0, 0, 948, 0, 0, 744, 0, 102, 715, 907, 0, 653, 323, 0, 704, 491, 38, 316, 826, 970, 0, 697, 0, 47, 0, 0, 0, 0, 0, 470, 939, 639, 0, 904, 533, 0, 0, 523, 0, 686, 0, 177, 507, 0, 0, 0, 777, 0, 504, 212, 285, 0, 174, 0, 0, 0, 143, 630, 463, 249, 474, 0, 0, 336, 0, 0, 0, 787, 742, 400, 0, 121, 978, 706, 558, 875, 0, 0, 231, 456, 76, 184, 369, 0, 0, 654, 471, 586, 344, 145, 0, 0, 332, 121, 52, 917, 824, 0, 0, 815, 947, 885, 591, 0, 10, 0, 331, 0, 0, 454, 0, 103, 718, 475, 672, 0, 0, 0, 86, 90, 529, 303, 769, 379, 796, 86, 0, 472};
        Arrays.sort(arr);
        System.out.println(maxodd(arr)); 
        
    }
}
