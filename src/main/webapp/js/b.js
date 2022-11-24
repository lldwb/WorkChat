Vue.component("myb",{
    data(){
        return {
            sj:this.$route.params.sj,
        }
    },
    template : `<div style="background-color:#F5F5F5;width: 100%;height: 540px">
        <van-row type="flex" style="background-color: white;margin-bottom: 5px" v-for="shu in sj">
                <van-col span="7" style="height: 70px; text-align: center;margin-top: 10px">
                    <img src="https://img01.yzcdn.cn/vant/cat.jpeg" width="50px" height="50px"  />
                </van-col>
               <van-col span="17" style="height: 70px;" >
                    <van-notice-bar style="margin-top: 5%" color="black" background="white">{{shu.name}}</van-notice-bar>
                </van-col>
           </van-row >
        </div\>`
})