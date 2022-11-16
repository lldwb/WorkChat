Vue.component("myc",{
    data(){
        return{
            listw:that.$route.params.listw,
            sj:that.$route.params.sj,
        }

    },
    template :"<van-row type=\"flex\" style=\"background-color:#F5F5F5;padding-bottom: 60px\">\n" +
        "        <van-index-bar :index-list=listw>\n" +
        "\n" +
        "        <van-col span=\"24\" ><van-cell title=\"联系\" /></van-col>\n" +
        "        <van-col span=\"24\" ><van-index-anchor index=\"1\">{{this.$route.params.sj}}</van-index-anchor></van-col>\n" +
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