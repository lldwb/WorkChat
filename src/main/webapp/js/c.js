Vue.component("myc",{
    data(){
        return{
            listw:this.$route.params.listw,
            sj:this.$route.params.sj,
        }

    },
    template :`
           <van-index-bar :index-list="listw">
           <van-row type="flex" style="background-color: #F5F5F5;">
          <van-col span="24" ><van-cell title="联系人" style="width: 100%;height: 100%"/></van-col>
        <van-col span="24" ><van-index-anchor index="1">杰</van-index-anchor></van-col>
        <van-col span="24" v-for="shu in sj">
        <van-notice-bar color="black" background="white">{{shu.name}}</van-notice-bar>
        </van-col> 
         </van-row>
    </van-index-bar>
  
`

})