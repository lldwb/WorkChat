Vue.component("myc",{
    data(){
        return{}
        indexList: [1, 2, 3, 4, 5]
    },
    template :"<van-row type=\"flex\" style=\"background-color:#F5F5F5;\">\n" +
        "        <van-index-bar :index-list=[1,2,3,4,5]>\n" +
        "\n" +
        "            <van-col span=\"24\" ><van-cell title=\"联系人\" /></van-col>\n" +
        "        <van-col span=\"24\" ><van-index-anchor index=\"1\">杰</van-index-anchor></van-col>\n" +
        "        <van-col span=\"24\" ><van-cell title=\"杰1\" /></van-col>\n" +
        "        <van-col span=\"24\" ><van-cell title=\"杰2\" /></van-col>\n" +
        "        <van-col span=\"24\" ><van-cell title=\"杰3\" /></van-col>\n" +
        "\n" +
        "        <van-col span=\"24\" ><van-index-anchor index=\"2\">杰</van-index-anchor></van-col>\n" +
        "        <van-col span=\"24\" ><van-cell title=\"杰1\" /></van-col>\n" +
        "        <van-col span=\"24\" ><van-cell title=\"杰2\" /></van-col>\n" +
        "        <van-col span=\"24\" ><van-cell title=\"杰3\" /></van-col>\n" +
        "\n" +
        "        <van-col span=\"24\" ><van-index-anchor index=\"3\">杰</van-index-anchor></van-col>\n" +
        "        <van-col span=\"24\" ><van-cell title=\"杰1\" /></van-col>\n" +
        "        <van-col span=\"24\" ><van-cell title=\"杰2\" /></van-col>\n" +
        "        <van-col span=\"24\" ><van-cell title=\"杰3\" /></van-col>\n" +
        "\n" +
        "        <van-col span=\"24\" ><van-index-anchor index=\"4\">杰</van-index-anchor></van-col>\n" +
        "        <van-col span=\"24\" ><van-cell title=\"杰1\" /></van-col>\n" +
        "        <van-col span=\"24\" ><van-cell title=\"杰2\" /></van-col>\n" +
        "        <van-col span=\"24\" ><van-cell title=\"杰3\" /></van-col>\n" +
        "\n" +
        "        <van-col span=\"24\" ><van-index-anchor index=\"5\">杰</van-index-anchor></van-col>\n" +
        "        <van-col span=\"24\" ><van-cell title=\"杰1\" /></van-col>\n" +
        "        <van-col span=\"24\" ><van-cell title=\"杰2\" /></van-col>\n" +
        "        <van-col span=\"24\" ><van-cell title=\"杰3\" /></van-col>\n" +
        "    </van-index-bar>\n" +
        "    </van-row>\n"
})