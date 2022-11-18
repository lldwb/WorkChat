Vue.component("myc",{
    data(){
        return{
            listw:this.$route.params.listw,
            sj:this.$route.params.sj,
        }

    },
    template :`
                <van-row type="flex" style="background-color:#F5F5F5;padding-bottom: 60px\">
              <van-index-bar :index-list=listw>
              <van-col span="24" ><van-cell title="联系人" /></van-col>
              <van-col span="24" ><van-index-anchor index="1">{{sj}}</van-index-anchor></van-col>
            </van-index-bar>
            </van-row>`
})