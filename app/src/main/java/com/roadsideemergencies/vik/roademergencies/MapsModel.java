package com.roadsideemergencies.vik.roademergencies;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vik on 7/4/17.
 */

public class MapsModel {


    /**
     * html_attributions : []
     * next_page_token : CpQCBgEAABYWEOnPeFC3RK_IgayNV4NgcTAbQry8JaQph5FW4i8hK4QI_II1rMZ1mSqZVWbnDe7y-TCjmMO-LXWrWpLJayz_0S8YDeIui11HcRly6lWnkRBpCv2WCbHkOmBQIfzUmf-32om6KpMZP2tTfVEzlFrjrn5pV6_cVHzNZYmeuuGO-vMfp8N7BX9AEhnUPY72h3EcMUtTA4Pc5yuZr6MjGJx8V5YY5EG4vSWvKiAxYU_lL98iwdaXNovrtpXWf1blnUAO_tb-jq_RFghHo6qzzVxOFVI1QLNwzLcG-7bUt59Ncn7qtqM7Wk1_GGC5vD1YfPz76lpkjSquH1MuO7vo9-XNPahN3yAwf5zGArdJGLQ3EhByvWa_qq6vpBDbMcT3V4nrGhRCK1ZxMDu-kIqTWU-x6SWieMwoRg
     * results : [{"geometry":{"location":{"lat":28.6139391,"lng":77.2090212},"viewport":{"northeast":{"lat":28.65048,"lng":77.3449601},"southwest":{"lat":28.4041,"lng":77.07301009999999}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/geocode-71.png","id":"910e9ee78403c6726e140168f78ca0fb0063bcc8","name":"New Delhi","photos":[{"height":1836,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/116600689303848489474/photos\">Sajin R<\/a>"],"photo_reference":"CoQBdwAAAIciT0F4XpgbApz2XfpWo-tYe8F68UvG1nSfv98k0RZIkUo5xwGPoJQXdbjNDwW8u1epcPdlcEECMyYjIwaF8iOahQCpg2Jeo3KVV5K403vq7JJvz1qSZRDvyPVVzKET9x9KKlm7lwBbeZKrjstVqwLXATjFWcOjRNLtC69ucbnVEhDnviQtkPUfh-DXq15GSWNSGhSvddMLQXJVfc9F3hQK_DOOeOimmA","width":3264}],"place_id":"ChIJLbZ-NFv9DDkRzk0gTkm3wlI","reference":"CmRbAAAAWcotvJK8kt14TneWrRaYJF1W91XOEQZMwo27ynXnq542DA-RW8Q39fDgUv7IXJ91Tc3oc92ypH-to9rOcjv3n1CNVxLWbuFxUQeIn80w-0wpMRubrrBtF0LyLGkf_FnVEhA6XsOLr3a_yJ566A591XeLGhTSu_MKiaXsn2WsyyZzggfLvcJYuw","scope":"GOOGLE","types":["locality","political"],"vicinity":"New Delhi"},{"geometry":{"location":{"lat":28.4964595,"lng":77.1860951},"viewport":{"northeast":{"lat":28.4978084802915,"lng":77.18744408029151},"southwest":{"lat":28.4951105197085,"lng":77.1847461197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"0209204e55eaba01f282d59457726b28c1d9ee90","name":"Tivoli Garden Resort Hotel","photos":[{"height":2368,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/109313837680689955806/photos\">Stephen Chinnaswamy<\/a>"],"photo_reference":"CoQBdwAAAIaimY5mtP26sU7fKcka-Zfefw-pOpJe_oV-021UgPDSv69gzmDWMQhvmfjsrAhW9b3DJUTcYmGaQIffPM44EXequN9MAu01a9SzfYRwcEGQSx8pWPxDfbOf9QuWnd6ui0QfDPwkVk4bdGqC_uFWZ8sPkx6ImyEhSu3STEig89y6EhCsm6FhBm60VwPJlK1gjXAfGhSCBSmfpJU7o75eJXcsByRPXj8OlQ","width":4208}],"place_id":"ChIJwRT3qCUeDTkRecFelntewZs","rating":4.1,"reference":"CmRSAAAANHDHpfjh7p120TgH-it3sNLfY2WeqoBx5QWrjf__3V9PfMCr-Umv4rwcMyaTbF6FnoYPu64QbwoDkiS2rG10GJ9EyxXKiD-GBM3mmEXsHKE7FBta5JatwZudYAaGgb2eEhBpp0VoA_ZXiFjw_APvhpOKGhTtrzZ9xVItaJmvPSx3torI0XI8Tg","scope":"GOOGLE","types":["lodging","point_of_interest","establishment"],"vicinity":"Chhattarpur Hills, Near Chattarpur Mandir, Mehrauli, Chattarpur Road, New Delhi"},{"geometry":{"location":{"lat":28.498551,"lng":77.18485199999999},"viewport":{"northeast":{"lat":28.4998999802915,"lng":77.1862009802915},"southwest":{"lat":28.4972020197085,"lng":77.1835030197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"0efb9b9b47d53b9771691006684734f49abd9c56","name":"Delight Inn","place_id":"ChIJochukyQeDTkR3vgC24yqCh4","rating":3.3,"reference":"CmRRAAAA1SbiegpQrHz3s1bt9NWu9t4vezUjgcLJWQIoKIsn0ZNsZ5B3MK29gkNG6ptM1vdTOtCJAAAm6-mkadSY4KSDkbMDCx9brOd6A3wkrApt95jeED4ccc99CODjKCkbyjgkEhA3qaKFUsu0zqKDgPS57uL7GhQcnWnzmoJXRVNHTjVu7wbSgQWrOw","scope":"GOOGLE","types":["lodging","point_of_interest","establishment"],"vicinity":"336, 40-41, Near Bank Of India, Near Chattarpur temple, Main Chattarpur Road, Block A1, Chattarpur, Chhattarpur, New Delhi"},{"geometry":{"location":{"lat":28.499975,"lng":77.16847299999999},"viewport":{"northeast":{"lat":28.5013239802915,"lng":77.16982198029149},"southwest":{"lat":28.4986260197085,"lng":77.16712401970848}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"8f0f0701a02f7fc1fd15670032c0af6ae69fa16f","name":"Talisman Advisors Pvt. Ltd.","place_id":"ChIJN41iHkEeDTkRKPlNUYkZSJ8","reference":"CmRSAAAADsakomLi0ckUSW3QG0leviuMQ_4mbS_hey62MuNubVt9-58H7pMwAhP-zRFhxJLDE0Jq1vRpwiWKrYW3V6PvpQsb0Hx0gk4VV82ocnLFkkH68Qj6R3klinN1TiX2ZcldEhDC3DxTFhM04tNgOspsl9wAGhSGRpkTTNQ0v4hdfTx3NTvJSw5WiA","scope":"GOOGLE","types":["point_of_interest","establishment"],"vicinity":"127, Neel Gagan, 2nd Floor, New Mangla Puri, Mehrauli, New Delhi"},{"geometry":{"location":{"lat":28.5067561,"lng":77.1785328},"viewport":{"northeast":{"lat":28.5081050802915,"lng":77.17988178029151},"southwest":{"lat":28.50540711970849,"lng":77.17718381970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"0184a48c8e17b6422760ad5fddee21f408eb7719","name":"Shootout Zone","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":3120,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/105419160421678320809/photos\">Arpit Aggarwal<\/a>"],"photo_reference":"CoQBdwAAAD5yGd78qKpplH7r_czrCwnsJcmE7SzG6Q3IxltRBSYYkhmAEra_wvmfWV8kbrK7uUObpYZgxow81rb_lCsga3jgwAXNz8I6deI3LdbGoK85s_sB5Sx_ETwrqzmQ3yS8JdWqwBs7Dk03P0FThSHyr-vDkjvng1xEsIFu5KGP44RpEhBMtZnXLQhZHvb4iKuKb4cUGhRepVYdvuXMHWt0l0UrBUBMB6oKFg","width":4160}],"place_id":"ChIJV2HNrBceDTkRT6RrgkseDKk","rating":3.7,"reference":"CmRSAAAAMGY2CJ7e0w0LvBoQzj6UQG6tiWiCKZP16Llv4uDsJZkt3CKi6bO8WotgDz8m300_C591IFEk9ARZsMnpblI6qryExd63fvxg4KP3BrpE_mVf_J_cfT7qgQTplqtJ74nlEhBHZKjVHxiuuop2mMv4zlH6GhQldVKNcK2DWc36FxIjRrJO9-E9Cw","scope":"GOOGLE","types":["point_of_interest","establishment"],"vicinity":"A- 265, Andheria Modh, Near Kishan Haat, New Delhi"},{"geometry":{"location":{"lat":28.50246689999999,"lng":77.1705343},"viewport":{"northeast":{"lat":28.5038158802915,"lng":77.17188328029151},"southwest":{"lat":28.50111791970849,"lng":77.16918531970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"39a330b01dff900c1393a88487622e2401cde33e","name":"Lutyens Resort","photos":[{"height":1552,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/102006864304097632749/photos\">Jagjeet Singh<\/a>"],"photo_reference":"CoQBdwAAAM6RR4CdRYSO8ApNc89WyKqZN76Ee7zR6kEIfDCjMOU_W7ZcMSx3VUy4RxQi2rrf0bxqJj2hZyYnp8EHA11C5rEHux0GaApw_ooOHhccka1aHx5E25JnjQAAO5bDUN-y_cVf6_XtK1WPRL0_VPDOMqXVgE9q_v0J8-ZWaVF9lJqsEhCDgxyfA7LFDj6ASTNKCKSiGhQ-8m36SoSkO6l9KlxDYyGbp9PN2Q","width":2592}],"place_id":"ChIJq_I7bEAeDTkRatGA5-zQ7cI","rating":4,"reference":"CmRSAAAAzR_Xis36xQi12brjYT4VEL0Kf7yEo81CTFm_bWQ1QEZczhnjaAGtFzxKweiKgSirWx46DSGgq7WtnIOdI9Zs5N_C_G3EIRJcBiGqHBGt66ZSrcdL3NeM9ohzn9mWsLxZEhCz80DLmbjouinRzbXaHKtwGhS_oLaDkljBZOEy773oxGNwsmA5rg","scope":"GOOGLE","types":["lodging","point_of_interest","establishment"],"vicinity":"222/223, New Mangla Puri, Mehrauli, Gurgaon Road, New Delhi"},{"geometry":{"location":{"lat":28.5018592,"lng":77.168749},"viewport":{"northeast":{"lat":28.5032081802915,"lng":77.1700979802915},"southwest":{"lat":28.5005102197085,"lng":77.1674000197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/shopping-71.png","id":"5e621082c2374268a5189a19b6477825cd9f563f","name":"Ferns N Petals - Florist & Gift Shop","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":400,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/116455001968684804238/photos\">Ferns N Petals - Florist &amp; Gift Shop<\/a>"],"photo_reference":"CoQBdwAAAMebYmA6kWrCRCe706-HowFCXP19R0QExo6w-kuLiS5XAYz_7ccn0_mH0J0gOop1u6kPX9ZznihnqPdODBNjERluXLNGbHWatxkZD5686ypyQSkPjgKm0bHIrjuh-cOlUSYCeHFob1Sb437h-LSMb7J1y78aYL4ZlVxc2jakoVTrEhCMvJbIHrOjcDtxq_s-uDmkGhT5dWcHKS77CkYDAwml0V3ToK4z7A","width":400}],"place_id":"ChIJpzH4K8T9DDkR3MfSzrvxrlo","reference":"CmRRAAAAJoZXa7kFneQXTXKnDz5OGUCaga8q83VBYgW1w4rRZP3pC6ToK8_iy0izqafmb-84GlZSSVRfFCDgdZWlgluiJpQth9ZeNpkP_KCq_pnSjQ3eZ0PesgXdmrXIp7Sec6ytEhDTr52Ubf7SRsT89LYErGgIGhSaBiMn2pBf_TlEMPZCoMft1l2U9g","scope":"GOOGLE","types":["florist","bakery","food","store","point_of_interest","establishment"],"vicinity":"A 225, New Manglapuri, M.G. Road, Delhi"},{"geometry":{"location":{"lat":28.503893,"lng":77.17152},"viewport":{"northeast":{"lat":28.5052419802915,"lng":77.17286898029151},"southwest":{"lat":28.50254401970849,"lng":77.17017101970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"5f5fd81ff2bb2d3a7f0f7f4359aba2aed372481f","name":"Tonino","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":640,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/102782199455794370149/photos\">Tonino<\/a>"],"photo_reference":"CoQBdwAAAG7eZgAlO1zywRgyUaInMymiHvVQBr6Rf86xcRkT1BmjOuJjcJxBKEv-FZJluiZq7TVxCdUvpSC0zO7fzPKwF3aspAY_Z09QDimiOMAttQVrjw-esCmfIeQ0XgslDOpF80ObhtXdMYx4lLPpaKFp9E8Qbo5hVr8tz0HQCMWGLRfNEhCSARox2jAKoHU8Nxesc4KuGhQ8pPm5RJpr8k79R6y3EfnHM4xBLg","width":1024}],"place_id":"ChIJVVVVVTEeDTkRB8mVmktQNPY","rating":4.4,"reference":"CmRSAAAAhWsho8hEJnt2-0kBvuAtuHfQ3wu1LZLW-Z1yO4Dl3sSoMA8hZsWukRBoXX6Dc-W_Bdwj5rttCcm38RyyvIBrI_tSRU3hR6exkqHdiVtR46cNDclZ-ZIe5iOKfBkr3VLdEhAgltZvXLF1JRSg4X08xV2BGhRRer23VczfJ85rkcd_CIY97vqvXA","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"Khasra No.76/27, Mehrauli-Gurgaon Road, Near Metro Pillar No.38, New Manglapuri, Mehrauli, New Delhi"},{"geometry":{"location":{"lat":28.49397149999999,"lng":77.1787425},"viewport":{"northeast":{"lat":28.4953204802915,"lng":77.18009148029151},"southwest":{"lat":28.49262251970849,"lng":77.17739351970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/shopping-71.png","id":"5a59d2fbaa6cc4f6deb46a908aaa7a6ead3e7488","name":"The Nature","place_id":"ChIJd-3rnjD9DDkRIuVNElTMhcY","reference":"CmRSAAAAtWWxoA_7WT_BGWpEK2qspnIaZtkpw5nqOFSCpObjqckwVKBRF6sUX1E5UXHphBDwkX9cW3z5d7QDIvggIFKFdWzVMj41Qn8t3IYV5SVCiReBnlA9kZmhDUF8LHtTlDlwEhBPua1vfrW0zbTzf6SgWVqlGhRLPvA-sLlB9XyAXHU6Pk9YeijiBw","scope":"GOOGLE","types":["store","point_of_interest","establishment"],"vicinity":"109,Satbar Village,Chattarpur, New Delhi"},{"geometry":{"location":{"lat":28.502488,"lng":77.176208},"viewport":{"northeast":{"lat":28.5038369802915,"lng":77.17755698029151},"southwest":{"lat":28.5011390197085,"lng":77.17485901970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/shopping-71.png","id":"279d40947f1c52d9578cb0a1fcde1bca55b5eb11","name":"Hindustan Plywood Co. Regd","opening_hours":{"open_now":false,"weekday_text":[]},"place_id":"ChIJ10qHxkH9DDkRBilwnlXeLyc","rating":5,"reference":"CmRRAAAAQFkTpSiNfzOLxW0NrwEMXSC1xjC7mulo7Cx4vVwHM4yV6gaGn16zG2EktrDdYl5pg2VOh8-7D3-1z6VLWpRQaPFJoWJHRdZqWZZ_JGsr1rg_C4eiH8-LhfTsELqPmaX3EhA1Y7jf5jBBLgfd1Lo886lZGhTv6_dSG6UW5Z2786b751AfLrNzZA","scope":"GOOGLE","types":["store","point_of_interest","establishment"],"vicinity":"D-34, Plot No. 595 & 597, 100ft Road, Chattarpur Pahari, Chattarpur, New Delhi"},{"geometry":{"location":{"lat":28.50303049999999,"lng":77.1703076},"viewport":{"northeast":{"lat":28.50437948029149,"lng":77.17165658029151},"southwest":{"lat":28.50168151970849,"lng":77.16895861970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"8806de002f30715302c9135cfadd428d0de5bd4e","name":"LTC, LTC 80, North East, Kashmir, Kerala, Goa, Andaman, Port Blair, Singapore","opening_hours":{"open_now":true,"weekday_text":[]},"place_id":"ChIJScVeQFkeDTkRFvvRtQ0D8QQ","reference":"CmRRAAAAsU1tAmuFUzUjdufhLOR8CAHwA244pxDQkBsN-GNk8aCXF6bWRUZVuOaHOunwgrOiu26omHKh2khzo-8_29D-d44MifDPhli0Y7LvB6gP4ACWe_WuCcvTal_2ifaMinc3EhBqryRvkIOLty6cW8e4n3rNGhQQAqnMWJjHXy9qgDy3UavgO7bRog","scope":"GOOGLE","types":["travel_agency","point_of_interest","establishment"],"vicinity":"Saint Travel Services, 87, LGF, Mehrauli Gurgaon Rd, New Manglapuri, New Delhi, Delhi 110030, In, New Delhi"},{"geometry":{"location":{"lat":28.49683019999999,"lng":77.1849421},"viewport":{"northeast":{"lat":28.49817383029151,"lng":77.1863187302915},"southwest":{"lat":28.4954758697085,"lng":77.1836207697085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"8d8cefccd9e11251effee26bd5e6aff725b68fc8","name":"HDFC Bank","opening_hours":{"open_now":false,"weekday_text":[]},"place_id":"ChIJDaRWOiUeDTkRuNJPohA6ps8","rating":2.8,"reference":"CmRSAAAAcxACU-HPqiGmFivb3cYUU6paQTuScWdxhu3ogXxwoUdRO-wgOUXCwLGjAn6en1adV9y3jpQXB7i7CuTmno5un8k-EdUqM6_Uf7kmRuRuPqvB3a1ZczEQWnPD4RNsM5KCEhBZ_LETYuORNwYW8GhBlRw1GhTq61zHjrnRYbtPba6ngwc66K47nw","scope":"GOOGLE","types":["bank","atm","finance","point_of_interest","establishment"],"vicinity":"Khasra No.619/21, Main Chhatarpur Road, Chattarpur, Chhattarpur, New Delhi"},{"geometry":{"location":{"lat":28.4931715,"lng":77.1743434},"viewport":{"northeast":{"lat":28.4945204802915,"lng":77.17569238029151},"southwest":{"lat":28.4918225197085,"lng":77.17299441970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"97ed019e6308d3e94b20f37d2171e0f20bee76a4","name":"D T C Pac and Move Delhi Storage","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":540,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/115612889555798775943/photos\">Anubha Gupta<\/a>"],"photo_reference":"CoQBdwAAAJVF7aLn5G05drlbGGGgX3SWjydbi7EemvMAeUDXDy4FbkffC-KoNBPCmgY0fBGUCsCw9WCwUpcZJrLxJ1XXMr-g5QPndFbRPHdVq0g2tChEc98HWp7podS7dGulDW3H0LofX16LC8dLJG6KypVovvIdH4ED6mCDi6Qeue-lV8BTEhBhSu-yFcinCeIwZGA3bbqIGhRHpuCs5IU6nVG-pyY94lAnuX8ezw","width":960}],"place_id":"ChIJS0ZGNvceDTkRGSVnmWHs0ZE","rating":3.9,"reference":"CmRSAAAApRAGvrQKbKnD93u-sSIMepxak2AuTc0FZZM4vBiZJy0tuo8DYGhh0RsFbP7q1CRYBOJf-qU6IfX_Lb8xtnmDWdH7b2mpKBi26ChIA7CiF6yY0-MyrS4Jgf4PBr-kO1F_EhAadpT5s07nFFkUzw_nF-E8GhQ1em3U6uPZ4rE8IdKf9Gb3JKRb2g","scope":"GOOGLE","types":["restaurant","place_of_worship","food","point_of_interest","establishment"],"vicinity":""},{"geometry":{"location":{"lat":28.4939878,"lng":77.17708879999999},"viewport":{"northeast":{"lat":28.4953367802915,"lng":77.1784377802915},"southwest":{"lat":28.4926388197085,"lng":77.17573981970848}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/school-71.png","id":"356f7771324e1c8b9963847b47b8caff32508e88","name":"Applied Research International","place_id":"ChIJhbzE8zkeDTkRg0NtwRsAhqI","rating":4.8,"reference":"CmRSAAAAsjly8wRaxp5n7uGuBbweoTW-NLeVZ3CyArViVQYDCDoVJjD1lFfTRP2wBLBqbZa0OlHX4xXtGKZgOh-n8nhuOYnQggSI_dCQFcpkND3AF8qk1Xh1Ri2x6uk7o-6ZfJfyEhB528zYBMqGjOKjVv0Y14QdGhRdK7vWLT6fHPvgr-zsByraXydQIg","scope":"GOOGLE","types":["point_of_interest","establishment"],"vicinity":"D-150/S, D Block, Chattarpur Extension, New Delhi"},{"geometry":{"location":{"lat":28.5016773,"lng":77.1845195},"viewport":{"northeast":{"lat":28.5030189302915,"lng":77.1859240802915},"southwest":{"lat":28.5003209697085,"lng":77.1832261197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"0d9ecadca6b16a8a1bb176c3a72176ac477d5289","name":"First Flight Courier","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":850,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/117863158659485887972/photos\">First Flight Courier<\/a>"],"photo_reference":"CoQBdwAAAMrTTjXkQfCc91hCg_CO4izXn9Vlv7qmsLVOtnG1ZEXrM5YpWGmbFKLlfnthTN30Puv7p7F2zOA0x-tEHqsx9KhzvS9L_it7TGz0PV61uvUco3nFWcyODT7D7zROalIy7RWwGmlhIYFnfmJYA5C0C_rAhZdvT8unL6ZGjd6O9SB5EhBWOPio1Bl2bMS9lK7cL-IkGhQVdD3axCjqhHK_E5-pq4tHW_iUfg","width":856}],"place_id":"ChIJ7xcYXiMeDTkRk-fZGRdhHL8","rating":4.3,"reference":"CmRSAAAAOt4H29gEhplLSHY0T4UEqsfzafhMNPtvxujcKHa4YorEvTkx6LEciLl1-yIVrLw5NeTq0gkNNRWb1O0fw7f9mNdiZqJJervshV1MYGS-9-n24KoHnBuaiTVZA6ws4oEwEhA3Q-IsTA4yR2Fsz0_TuTSJGhT_472NpdnQ3TFQSH3T1Ltfivndyg","scope":"GOOGLE","types":["moving_company","storage","point_of_interest","establishment"],"vicinity":"Sharma Complex, 100 Feet Road, Dr Ambedkar Colony, Chhattarpur, New Delhi"},{"geometry":{"location":{"lat":28.50377689999999,"lng":77.17862149999999},"viewport":{"northeast":{"lat":28.5051258802915,"lng":77.1799704802915},"southwest":{"lat":28.5024279197085,"lng":77.17727251970848}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"15175dd88fba93785eb33c11c827b034220a1d1d","name":"homeopathy lady doctor","opening_hours":{"open_now":false,"weekday_text":[]},"place_id":"ChIJ96Uc6z0eDTkRnp4GEX7Ldfg","reference":"CmRSAAAAtCIk0-FNgkvNWEZvZNAMGRAX2gEsoB66hsOsuKrVnUpfpaTDZABl_HWKdFasBqpjgn4wHY_eFrImmXllV2BKTi9PIkj8POdi80wlO_olMxTkOpCVutPCrUgDJ6RoXL_0EhBce7_VFZnB7S0bP0i_C-WjGhRiv-tioBlJ7DC8wr_LPKjR3xkHbA","scope":"GOOGLE","types":["health","point_of_interest","establishment"],"vicinity":"chatterpur,New Delhi, New Delhi"},{"geometry":{"location":{"lat":28.4937432,"lng":77.1825247},"viewport":{"northeast":{"lat":28.4950921802915,"lng":77.1838736802915},"southwest":{"lat":28.4923942197085,"lng":77.18117571970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/shopping-71.png","id":"b3f031d10cabb205c36608d9e46275f1fc32ba35","name":"The Nature","place_id":"ChIJd-3rnjD9DDkRdMlteHZhH18","reference":"CmRRAAAAhDgIb_ChX-3LKHRpkRnJhDwrY3M3RM0P0lI2GPBkuT6Zzm-lusXmm2cW_j1N_v2ReyAuCXw86TV7VJXMpAZyiDswjf1Vpjvuf5wkw5OiPN64D6CpLH5wzOL-1wQQCbvQEhDTiNPNNDDc51aQzev-Ha-nGhTqQKFUH6aJRxiVrxRg8qOoSxHIlg","scope":"GOOGLE","types":["store","point_of_interest","establishment"],"vicinity":"79, Satbari Village, Chattarpur, New Delhi"},{"geometry":{"location":{"lat":28.503603,"lng":77.177295},"viewport":{"northeast":{"lat":28.5048579802915,"lng":77.17858628029151},"southwest":{"lat":28.5021600197085,"lng":77.1758883197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"b0b478468015d202d2c1a2924d07eefccbecc424","name":"Adhyatm Sadhna Kendra","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":1365,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/108657538632966552191/photos\">Adhyatm Sadhna Kendra<\/a>"],"photo_reference":"CoQBdwAAAA2fJvTT1bbaIvYStXsay312L5BIWtmgOAf_gXaULxUwr0DgZxP6isaTgxGMG8l-XYG-SmPKn0VfOdb3t2SJwMFV_iAN-nVlvBujaTsmtTy5TITfqj5DLvMdVKs7Cj9kduLRZubGqPA5FEjw9ByaS12Tz2QDyxo7JH7s6dEJ4xaOEhANwRkeSWaq8ckWD0PjlJflGhTNL2HM3m6KAY82eyD65owjiuLI1Q","width":2048}],"place_id":"ChIJjS6GjhUeDTkRZ42popskjgc","rating":4.1,"reference":"CmRRAAAANxjwh1TAqhcP9cmQV89QOeMec0bZppgLPOOGTktEVOJ9NtuxIUY4zazvL4wskwFe6n73XSR7Rj0_x0Lt3pT8f-e_T46sm0uPApusKYT30PoDEJe6pvqr8Yfz92FB0GU8EhCnuqPJT_JMKsQUR4X9_ACoGhT8B6yZiuuA1xOL2xUZJZiaWYQU_g","scope":"GOOGLE","types":["health","point_of_interest","establishment"],"vicinity":"Chhatarpur Temple Inside Road, Dr Ambedkar Colony, Chhattarpur, New Delhi"},{"geometry":{"location":{"lat":28.50146,"lng":77.182999},"viewport":{"northeast":{"lat":28.5028089802915,"lng":77.1843479802915},"southwest":{"lat":28.5001110197085,"lng":77.18165001970848}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/shopping-71.png","id":"ee6c29311fc343c593ca3b2f1f44fbd200c22df4","name":"TATA ACE CNG SALES & SERVICE","photos":[{"height":800,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/105266655788749159822/photos\">TATA ACE CNG SALES &amp; SERVICE<\/a>"],"photo_reference":"CoQBdwAAANpTjSfQqhje9yEzgYMz7FldNMsvfoim6uXM_uaCdAY9_JqSCbDBd2NqpfIdEjA5LhWl0UizBBse7AuMk7nPRDALod7gjS2Vt3TLVoNpdxWZDjMxFVlZXBZDzGCc3wNaabkWW8n8uqFxwocaaMJlps2e4hRgD7EUw3T0Qi9zEyixEhAvtz9uALorW6t2X1UoXddSGhQNZuq3Ev1TEjn08jp7KxiNQV9ymg","width":938}],"place_id":"ChIJVR2uzDweDTkRlNU6ZeCHTYM","rating":4.5,"reference":"CmRSAAAAHTRBN2wRdXYdu2CTAAzOHV60g32FwIjtjIEi7dKV7G1QbP11uH3WSKCpNzw4MEGsmyrueq2V5dDvJaWjGIlIaobZxNh1z6oW-ncDXpqm_KBYkE-uJU9isO0CUx7bFN-3EhCyo-BtW2Vzk3Lwdmp2eJQzGhRJBn5ix9UxenB7KQFyB-yxc1wCHQ","scope":"GOOGLE","types":["car_dealer","store","point_of_interest","establishment"],"vicinity":"Chattarpur Mandir Road , Opp Dena Bank, Near Mehrauli, New Delhi"},{"geometry":{"location":{"lat":28.49754119999999,"lng":77.1837431},"viewport":{"northeast":{"lat":28.5026151,"lng":77.185003},"southwest":{"lat":28.492217,"lng":77.17981089999999}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/geocode-71.png","id":"1b735f0294b972edf83a50c6a1e6c8afe917228a","name":"Block A1, Chattarpur","photos":[{"height":2208,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/103541504549404063120/photos\">Ramamoorthy Ramalingam<\/a>"],"photo_reference":"CoQBdwAAANqpn-LQcKcAkG44QCW4JVtDrHre-MyVbGBiaS8ndYXA1jDMsVYh_WYiPtmNY10w--rr0l-oQrCLWaMf1chToZeKSHcneJaarHEETw7OUjOaXyFwUgOoeuexz0k0HYD0Pzp6E8o0vJ4OuzCai4_9cJpOnxPz1Pwdu4MovvzznbuEEhDm8iUpfyFFE7vufasUrcXXGhSUzGWZXNL4SiHoiLC8_KHU-0VJpA","width":3920}],"place_id":"ChIJo4cgMDseDTkROLLVFWCQBRY","reference":"CmRbAAAA0gDeQP-3D_yhdg7Li-CjXInEev8YCf5rJV0iFnd8KAXtV3IbazapfxccyrW0A5O6uTgksdvdxaAHcTOPvYFczKXGVCFPEKLsslv0ncS82pn1fjGEIZM7l2n-Ko4Ee4QSEhDVQulhAlUJhMOzBJBW4lTxGhTHZIP96ylEZ-nPcf4Y3uraHUDzgA","scope":"GOOGLE","types":["sublocality_level_3","sublocality","political"],"vicinity":"Block A1"}]
     * status : OK
     */

    private String next_page_token;
    private String status;
    private List<?> html_attributions;
    private ArrayList<ResultsBean> results;

    public static MapsModel objectFromData(String str) {

        return new Gson().fromJson(str, MapsModel.class);
    }

    public String getNext_page_token() {
        return next_page_token;
    }

    public void setNext_page_token(String next_page_token) {
        this.next_page_token = next_page_token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<?> getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(List<?> html_attributions) {
        this.html_attributions = html_attributions;
    }

    public ArrayList<ResultsBean> getResults() {
        return results;
    }

    public void setResults(ArrayList<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * geometry : {"location":{"lat":28.6139391,"lng":77.2090212},"viewport":{"northeast":{"lat":28.65048,"lng":77.3449601},"southwest":{"lat":28.4041,"lng":77.07301009999999}}}
         * icon : https://maps.gstatic.com/mapfiles/place_api/icons/geocode-71.png
         * id : 910e9ee78403c6726e140168f78ca0fb0063bcc8
         * name : New Delhi
         * photos : [{"height":1836,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/116600689303848489474/photos\">Sajin R<\/a>"],"photo_reference":"CoQBdwAAAIciT0F4XpgbApz2XfpWo-tYe8F68UvG1nSfv98k0RZIkUo5xwGPoJQXdbjNDwW8u1epcPdlcEECMyYjIwaF8iOahQCpg2Jeo3KVV5K403vq7JJvz1qSZRDvyPVVzKET9x9KKlm7lwBbeZKrjstVqwLXATjFWcOjRNLtC69ucbnVEhDnviQtkPUfh-DXq15GSWNSGhSvddMLQXJVfc9F3hQK_DOOeOimmA","width":3264}]
         * place_id : ChIJLbZ-NFv9DDkRzk0gTkm3wlI
         * reference : CmRbAAAAWcotvJK8kt14TneWrRaYJF1W91XOEQZMwo27ynXnq542DA-RW8Q39fDgUv7IXJ91Tc3oc92ypH-to9rOcjv3n1CNVxLWbuFxUQeIn80w-0wpMRubrrBtF0LyLGkf_FnVEhA6XsOLr3a_yJ566A591XeLGhTSu_MKiaXsn2WsyyZzggfLvcJYuw
         * scope : GOOGLE
         * types : ["locality","political"]
         * vicinity : New Delhi
         * rating : 4.1
         * opening_hours : {"open_now":false,"weekday_text":[]}
         */

        private GeometryBean geometry;
        private String icon;
        private String id;
        private String name;
        private String place_id;
        private String reference;
        private String scope;
        private String vicinity;
        private double rating;
        private OpeningHoursBean opening_hours;
        private List<PhotosBean> photos;
        private List<String> types;

        public static ResultsBean objectFromData(String str) {

            return new Gson().fromJson(str, ResultsBean.class);
        }

        public GeometryBean getGeometry() {
            return geometry;
        }

        public void setGeometry(GeometryBean geometry) {
            this.geometry = geometry;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public String getVicinity() {
            return vicinity;
        }

        public void setVicinity(String vicinity) {
            this.vicinity = vicinity;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public OpeningHoursBean getOpening_hours() {
            return opening_hours;
        }

        public void setOpening_hours(OpeningHoursBean opening_hours) {
            this.opening_hours = opening_hours;
        }

        public List<PhotosBean> getPhotos() {
            return photos;
        }

        public void setPhotos(List<PhotosBean> photos) {
            this.photos = photos;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public static class GeometryBean {
            /**
             * location : {"lat":28.6139391,"lng":77.2090212}
             * viewport : {"northeast":{"lat":28.65048,"lng":77.3449601},"southwest":{"lat":28.4041,"lng":77.07301009999999}}
             */

            private LocationBean location;
            private ViewportBean viewport;

            public static GeometryBean objectFromData(String str) {

                return new Gson().fromJson(str, GeometryBean.class);
            }

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public ViewportBean getViewport() {
                return viewport;
            }

            public void setViewport(ViewportBean viewport) {
                this.viewport = viewport;
            }

            public static class LocationBean {
                /**
                 * lat : 28.6139391
                 * lng : 77.2090212
                 */

                private double lat;
                private double lng;

                public static LocationBean objectFromData(String str) {

                    return new Gson().fromJson(str, LocationBean.class);
                }

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class ViewportBean {
                /**
                 * northeast : {"lat":28.65048,"lng":77.3449601}
                 * southwest : {"lat":28.4041,"lng":77.07301009999999}
                 */

                private NortheastBean northeast;
                private SouthwestBean southwest;

                public static ViewportBean objectFromData(String str) {

                    return new Gson().fromJson(str, ViewportBean.class);
                }

                public NortheastBean getNortheast() {
                    return northeast;
                }

                public void setNortheast(NortheastBean northeast) {
                    this.northeast = northeast;
                }

                public SouthwestBean getSouthwest() {
                    return southwest;
                }

                public void setSouthwest(SouthwestBean southwest) {
                    this.southwest = southwest;
                }

                public static class NortheastBean {
                    /**
                     * lat : 28.65048
                     * lng : 77.3449601
                     */

                    private double lat;
                    private double lng;

                    public static NortheastBean objectFromData(String str) {

                        return new Gson().fromJson(str, NortheastBean.class);
                    }

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class SouthwestBean {
                    /**
                     * lat : 28.4041
                     * lng : 77.07301009999999
                     */

                    private double lat;
                    private double lng;

                    public static SouthwestBean objectFromData(String str) {

                        return new Gson().fromJson(str, SouthwestBean.class);
                    }

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }

        public static class OpeningHoursBean {
            /**
             * open_now : false
             * weekday_text : []
             */

            private boolean open_now;
            private List<?> weekday_text;

            public static OpeningHoursBean objectFromData(String str) {

                return new Gson().fromJson(str, OpeningHoursBean.class);
            }

            public boolean isOpen_now() {
                return open_now;
            }

            public void setOpen_now(boolean open_now) {
                this.open_now = open_now;
            }

            public List<?> getWeekday_text() {
                return weekday_text;
            }

            public void setWeekday_text(List<?> weekday_text) {
                this.weekday_text = weekday_text;
            }
        }

        public static class PhotosBean {
            /**
             * height : 1836
             * html_attributions : ["<a href=\"https://maps.google.com/maps/contrib/116600689303848489474/photos\">Sajin R<\/a>"]
             * photo_reference : CoQBdwAAAIciT0F4XpgbApz2XfpWo-tYe8F68UvG1nSfv98k0RZIkUo5xwGPoJQXdbjNDwW8u1epcPdlcEECMyYjIwaF8iOahQCpg2Jeo3KVV5K403vq7JJvz1qSZRDvyPVVzKET9x9KKlm7lwBbeZKrjstVqwLXATjFWcOjRNLtC69ucbnVEhDnviQtkPUfh-DXq15GSWNSGhSvddMLQXJVfc9F3hQK_DOOeOimmA
             * width : 3264
             */

            private int height;
            private String photo_reference;
            private int width;
            private List<String> html_attributions;

            public static PhotosBean objectFromData(String str) {

                return new Gson().fromJson(str, PhotosBean.class);
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getPhoto_reference() {
                return photo_reference;
            }

            public void setPhoto_reference(String photo_reference) {
                this.photo_reference = photo_reference;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<String> getHtml_attributions() {
                return html_attributions;
            }

            public void setHtml_attributions(List<String> html_attributions) {
                this.html_attributions = html_attributions;
            }
        }
    }
}
