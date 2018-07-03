import Vue from 'vue'
import VueRouter from 'vue-router'
import Comp from './comp.vue'
//import App from 'bapp'
Vue.use(VueRouter)
var myModel = {
   name: "Madhav",
   age: 31,
   postFontSize: 1,
   posts:[{key:'1',title:'aayega mazaa'},{key:'2',title:'barsaat ka'}]
};
const Route1 = { template: '<div style = "border-radius:20px;background-color:cyan;width:200px;height:50px;margin:10px;font-size:25px;padding:10px;">This is router 1</div>' }
const Route2 = { template: '<div style = "border-radius:20px;background-color:green;width:200px;height:50px;margin:10px;font-size:25px;padding:10px;">This is router 2</div>' }
var customcompoment6={name:'customcompoment6',template:'<div>User {{ $route.params.id }}</div>'}

const routes = [
            { path: '/route1', component: Route1 },
            { path: '/route2', component: Route2 },
			{path:'/route3/:id',component:customcompoment6}
         ]
const router = new VueRouter({
            routes // short for `routes: routes`
         })


var customcompoment8={name:'customcompoment8',template:'<input value="ramnaam"/>'}
var customcompoment7={
	template:'<div><input value="bolradhabol"/><customcompoment8></customcompoment8><Comp></Comp></div>',
components:{'customcompoment8':customcompoment8,Comp}
	//export default{components:{Comp}}
}
Vue.component('blog',{template:'<div class="blog"><h3>{{title}}</h3><button v-on:click="$emit(\'enlarge\')">enlarge</button></div>',props:['title']});


Vue.component('custom-component1',{template:'<input v-bind:value="fifa" v-on:input="$emit(\'inputevent\',$event.target.value)">',props:['fifa'],data(){return{PaKiAankh:''}}});
Vue.component('custom-component2',{template:'<input v-bind:value="value" v-on:input="$emit(\'input\',$event.target.value)">',props:['value']});
Vue.component('custom-component3',{template:'',data(){return {count:0}},methods:{},props:['']});

Vue.nextTick(function() {
var myViewModel = new Vue({
   el: '#my_view',
   data: myModel,
   router,
	   
   //,
	//template: '<my-checkbox/>',
	components: { 'customcompoment7':customcompoment7}
});
})

Vue.component('button-mad',
{
template:'<button v-on:click="check">you clicked {{count}} times</button>',
methods:{check(){
	//this.checked=!this.checked;
	this.count++;
	}},
data(){return {count:0}}
}
);