Vue.component("myd",{
data(){
    return{

    }

},
    template : "<div id=\"metop\" type=\"flex\" style=\"background-color: #F5F5F5;width: 100%;height:540px\">\n" +
        "\n" +
        "        <van-row style=\"background-color: white;margin-bottom: 5px\">\n" +
        "            <van-col span=\"7\" style=\"height: 70px; text-align: center;margin-top: 10px\">\n" +
        "\n" +
        "                    <img src=\"https://img01.yzcdn.cn/vant/cat.jpeg\" width=\"50px\" height=\"50px\"  />\n" +
        "\n" +
        "            </van-col>\n" +
        "            <van-col span=\"10\" style=\"height: 70px\">\n" +
        "                <van-cell center title=\"昵称\" label=\"微信号\"/>\n" +
        "            </van-col>\n" +
        "            <van-col span=\"7\" style=\"height: 70px\">\n" +
        "                <van-cell value=\"更多\" is-link url=\"#\"/>\n" +
        "            </van-col>\n" +
        "        </van-row >\n" +
        "        <van-row >\n" +
        "            <van-col span=\"24\" style=\"margin-bottom: 5px\">\n" +
        "                <van-cell title=\"服务\" icon=\"manager\" is-link url=\"#\"/>\n" +
        "            </van-col>\n" +
        "            <van-col span=\"24\" style=\"margin-bottom: 5px\">\n" +
        "                <van-cell title=\"收藏\" icon=\"good-job-o\" is-link url=\"#\"/>\n" +
        "            </van-col>\n" +
        "            <van-col span=\"24\">\n" +
        "                <van-cell title=\"朋友圈\" icon=\"friends-o\" is-link url=\"#\"/>\n" +
        "            </van-col>\n" +
        "            <van-col span=\"24\">\n" +
        "                <van-cell title=\"视频号\" icon=\"video\" is-link url=\"#\"/>\n" +
        "            </van-col>\n" +
        "            <van-col span=\"24\">\n" +
        "                <van-cell title=\"卡包\" icon=\"after-sale\" is-link url=\"#\"/>\n" +
        "            </van-col>\n" +
        "            <van-col span=\"24\">\n" +
        "                <van-cell title=\"表情\" icon=\"smile-o\" is-link url=\"#\"/>\n" +
        "            </van-col>\n" +
        "            <van-col span=\"24\" style=\"margin-bottom: 5px\">\n" +
        "                <van-cell title=\"设置\" icon=\"bars\" is-link url=\"setup.html\"/>\n" +
        "            </van-col>\n" +
        "        </van-row>\n" +
        "\n" +
        "    </div>"
})