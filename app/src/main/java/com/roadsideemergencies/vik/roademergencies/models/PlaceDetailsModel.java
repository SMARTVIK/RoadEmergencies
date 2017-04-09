package com.roadsideemergencies.vik.roademergencies.models;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by vik on 8/4/17.
 */

public class PlaceDetailsModel {

    /**
     * html_attributions : []
     * result : {"address_components":[{"long_name":"Sultanpur Mandi Road","short_name":"Sultanpur Mandi Rd","types":["route"]},{"long_name":"Manglapuri","short_name":"Manglapuri","types":["neighborhood","political"]},{"long_name":"Manglapuri Village","short_name":"Manglapuri Village","types":["sublocality_level_2","sublocality","political"]},{"long_name":"Sultanpur","short_name":"Sultanpur","types":["sublocality_level_1","sublocality","political"]},{"long_name":"New Delhi","short_name":"New Delhi","types":["locality","political"]},{"long_name":"South Delhi","short_name":"South Delhi","types":["administrative_area_level_2","political"]},{"long_name":"Delhi","short_name":"DL","types":["administrative_area_level_1","political"]},{"long_name":"India","short_name":"IN","types":["country","political"]},{"long_name":"110030","short_name":"110030","types":["postal_code"]}],"adr_address":"<span class=\"street-address\">Sultanpur Mandi Rd<\/span>, <span class=\"extended-address\">Manglapuri, Manglapuri Village, Sultanpur<\/span>, <span class=\"locality\">New Delhi<\/span>, <span class=\"region\">Delhi<\/span> <span class=\"postal-code\">110030<\/span>, <span class=\"country-name\">India<\/span>","formatted_address":"Sultanpur Mandi Rd, Manglapuri, Manglapuri Village, Sultanpur, New Delhi, Delhi 110030, India","formatted_phone_number":"088002 66003","geometry":{"location":{"lat":28.50377060000001,"lng":77.17230049999999},"viewport":{"northeast":{"lat":28.50506908029151,"lng":77.1737370302915},"southwest":{"lat":28.5023711197085,"lng":77.1710390697085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"1cf9abe18c9e02af5f0e41a2867cbc8d32e8b598","international_phone_number":"+91 88002 66003","name":"Trillion Hotel","photos":[{"height":1836,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/111118727863684205920/photos\">jyotish mishra<\/a>"],"photo_reference":"CoQBdwAAALi68qsP__FiWDPwq4-sD1cgyKTU84qdB-CO7_f46D1t4l98Ul5KGo3-lsPNPZyuXOvCmMcDJOjS4r9g-88eNSHvV-bcOluEFOc3johKL1As3W0HdgEpYIkklxfe9PuWS_VNbcbuQHiQ4lMVXyj_g_jA-odXvip1UJGpLG6OoXqFEhCnviFnw-OWJPHOs0f2LN3FGhQl5LDwkIYqv8YJ6g1-8xadNM4X0A","width":3264},{"height":4160,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/102832834776295919744/photos\">Peter Tatrai<\/a>"],"photo_reference":"CoQBdwAAAIVoRdGa6fYY0T9YJ5WMaHMPZqGigK_9ZZHlInFa_1-6sYxG9kZIM1vgdzYzjlEj5qQAr17M6iYDUTs0P3NQjf83npB_CtPBV7gdvzCkXXt7JcuFxMSU6ZX6WEXmM3WRQpx3-ZZ_AP7Fz3BDQLoUrDhv7CFmVKt_AT85hOuJTomsEhAwQmHkUJaitWFbL0OfGT-9GhRynLLm42iQURY5VLZGV29XKj2t9w","width":3120},{"height":4208,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/111025261222385160242/photos\">rajan kumar<\/a>"],"photo_reference":"CoQBdwAAAPO7zqHobUwpTvSQOER-hs1NbXIm5mryxhnuSsJHZhrCXACpOPGJyh6jMn7z0tUDjdFbGqKK1ItuCA8cvm-KHjSGkckmoxVLYi-oUCrRz35RDi62mTgAYY6Hnmb-6QUv-KxWh261Yizkr5bYfzY6MijIINuisxT-9emhbPD0yH7vEhD8nqLAv82b5clz6bVmCg6tGhTImXnLpCT1xT-8gYp6qdq-uTE3SA","width":3120},{"height":1024,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/118108506396234113001/photos\">abhinav batra<\/a>"],"photo_reference":"CoQBcwAAAOWaUiokJHQrvY0t0xQPvLxhftUotoCnHcMRwgwv-wfidqAYz-Eoam5P3bJntCflo8I7GeQJFAdykAZCh7F3lzC6dVSeJGSKi72rVhbMxgQgQBwTWOO-YjuBr0awrMRM0BnDkFZKfvsArNJdUjEkf0US4eJoDaJpCU8GSPYu8TTHEhD38g-rzZGhkrvzESJCYNQiGhQk41fyWZ-IQhJ6zsjFPdSQV5TwRA","width":768}],"place_id":"ChIJn4E6eEAeDTkRF2bVhc63xBA","rating":4,"reference":"CmRRAAAAt5-zslQNVWJm4HqRR6--hFYFf1EE7MWsSC5-u_Z1-h-LcoYZxwN2_5N-_t3F2Rei4cSczYZjoeSSml5MrtsVg__Ou3AV3vFLBB6A35HMrInPHKTRNLh5fxKh8ITH1YhMEhCn9wOvawSGcd-xXPl3oRkbGhRtYfnBsIoTghYSTIFtXgcYc3XmkA","reviews":[{"aspects":[{"rating":1,"type":"overall"}],"author_name":"manish verma","author_url":"https://www.google.com/maps/contrib/108676299011711421878/reviews","language":"en","profile_photo_url":"https://lh6.googleusercontent.com/-lVongWbkhCM/AAAAAAAAAAI/AAAAAAAAAAA/AMcAYi97evoGmdZAyw5LyHViKXYsj5KGiA/s128-c0x00000000-cc-rp-mo/photo.jpg","rating":3,"relative_time_description":"a month ago","text":"Went to a wedding here.... it felt nothing great.... the place is ohkay.... maybe with a good decorator it could be better.... the property is fine....","time":1487005564},{"aspects":[{"rating":2,"type":"overall"}],"author_name":"maneet kaur","author_url":"https://www.google.com/maps/contrib/104581621344663510733/reviews","language":"en","profile_photo_url":"https://lh4.googleusercontent.com/-yY7JStBg4Ys/AAAAAAAAAAI/AAAAAAAAAB0/glHzaN7kZTQ/s128-c0x00000000-cc-rp-mo/photo.jpg","rating":4,"relative_time_description":"2 weeks ago","text":"Nice hotel.\nJuices were good","time":1490098399},{"aspects":[{"rating":2,"type":"overall"}],"author_name":"Amit Verma","author_url":"https://www.google.com/maps/contrib/103835461154520757255/reviews","language":"en","profile_photo_url":"https://lh5.googleusercontent.com/-2eqDjK1yELA/AAAAAAAAAAI/AAAAAAAAAAA/AMcAYi9kIgt4JOMtQrY0s_0KR-RAEnoSdA/s128-c0x00000000-cc-rp-mo-ba1/photo.jpg","rating":4,"relative_time_description":"2 weeks ago","text":"Nice food gud service ","time":1490278489},{"aspects":[{"rating":2,"type":"overall"}],"author_name":"Aaron Pereira","author_url":"https://www.google.com/maps/contrib/109955762833398639328/reviews","language":"en","profile_photo_url":"https://lh6.googleusercontent.com/-Bzsg93hEZtY/AAAAAAAAAAI/AAAAAAAAIRA/KW7C8iRmx9w/s128-c0x00000000-cc-rp-mo-ba1/photo.jpg","rating":4,"relative_time_description":"a month ago","text":"One of the majestic standalone wedding venues around here. ","time":1487706833},{"aspects":[{"rating":1,"type":"overall"}],"author_name":"Lakshay Handa","author_url":"https://www.google.com/maps/contrib/103557373801048291949/reviews","language":"en","profile_photo_url":"https://lh3.googleusercontent.com/-LR3AQYzO6r0/AAAAAAAAAAI/AAAAAAAAB6I/F1VsZbTEMnw/s128-c0x00000000-cc-rp-mo/photo.jpg","rating":3,"relative_time_description":"a month ago","text":"Food is not so good and service in critical","time":1486486376}],"scope":"GOOGLE","types":["lodging","point_of_interest","establishment"],"url":"https://maps.google.com/?cid=1208292697678636567","utc_offset":330,"vicinity":"Sultanpur Mandi Road, Manglapuri, Sultanpur, New Delhi","website":"http://www.trillionhotel.com/"}
     * status : OK
     */

    private ResultBean result;
    private String status;
    private List<?> html_attributions;

    public static PlaceDetailsModel objectFromData(String str) {

        return new Gson().fromJson(str, PlaceDetailsModel.class);
    }

    public ResultBean   getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
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

    public static class ResultBean {
        /**
         * address_components : [{"long_name":"Sultanpur Mandi Road","short_name":"Sultanpur Mandi Rd","types":["route"]},{"long_name":"Manglapuri","short_name":"Manglapuri","types":["neighborhood","political"]},{"long_name":"Manglapuri Village","short_name":"Manglapuri Village","types":["sublocality_level_2","sublocality","political"]},{"long_name":"Sultanpur","short_name":"Sultanpur","types":["sublocality_level_1","sublocality","political"]},{"long_name":"New Delhi","short_name":"New Delhi","types":["locality","political"]},{"long_name":"South Delhi","short_name":"South Delhi","types":["administrative_area_level_2","political"]},{"long_name":"Delhi","short_name":"DL","types":["administrative_area_level_1","political"]},{"long_name":"India","short_name":"IN","types":["country","political"]},{"long_name":"110030","short_name":"110030","types":["postal_code"]}]
         * adr_address : <span class="street-address">Sultanpur Mandi Rd</span>, <span class="extended-address">Manglapuri, Manglapuri Village, Sultanpur</span>, <span class="locality">New Delhi</span>, <span class="region">Delhi</span> <span class="postal-code">110030</span>, <span class="country-name">India</span>
         * formatted_address : Sultanpur Mandi Rd, Manglapuri, Manglapuri Village, Sultanpur, New Delhi, Delhi 110030, India
         * formatted_phone_number : 088002 66003
         * geometry : {"location":{"lat":28.50377060000001,"lng":77.17230049999999},"viewport":{"northeast":{"lat":28.50506908029151,"lng":77.1737370302915},"southwest":{"lat":28.5023711197085,"lng":77.1710390697085}}}
         * icon : https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png
         * id : 1cf9abe18c9e02af5f0e41a2867cbc8d32e8b598
         * international_phone_number : +91 88002 66003
         * name : Trillion Hotel
         * photos : [{"height":1836,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/111118727863684205920/photos\">jyotish mishra<\/a>"],"photo_reference":"CoQBdwAAALi68qsP__FiWDPwq4-sD1cgyKTU84qdB-CO7_f46D1t4l98Ul5KGo3-lsPNPZyuXOvCmMcDJOjS4r9g-88eNSHvV-bcOluEFOc3johKL1As3W0HdgEpYIkklxfe9PuWS_VNbcbuQHiQ4lMVXyj_g_jA-odXvip1UJGpLG6OoXqFEhCnviFnw-OWJPHOs0f2LN3FGhQl5LDwkIYqv8YJ6g1-8xadNM4X0A","width":3264},{"height":4160,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/102832834776295919744/photos\">Peter Tatrai<\/a>"],"photo_reference":"CoQBdwAAAIVoRdGa6fYY0T9YJ5WMaHMPZqGigK_9ZZHlInFa_1-6sYxG9kZIM1vgdzYzjlEj5qQAr17M6iYDUTs0P3NQjf83npB_CtPBV7gdvzCkXXt7JcuFxMSU6ZX6WEXmM3WRQpx3-ZZ_AP7Fz3BDQLoUrDhv7CFmVKt_AT85hOuJTomsEhAwQmHkUJaitWFbL0OfGT-9GhRynLLm42iQURY5VLZGV29XKj2t9w","width":3120},{"height":4208,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/111025261222385160242/photos\">rajan kumar<\/a>"],"photo_reference":"CoQBdwAAAPO7zqHobUwpTvSQOER-hs1NbXIm5mryxhnuSsJHZhrCXACpOPGJyh6jMn7z0tUDjdFbGqKK1ItuCA8cvm-KHjSGkckmoxVLYi-oUCrRz35RDi62mTgAYY6Hnmb-6QUv-KxWh261Yizkr5bYfzY6MijIINuisxT-9emhbPD0yH7vEhD8nqLAv82b5clz6bVmCg6tGhTImXnLpCT1xT-8gYp6qdq-uTE3SA","width":3120},{"height":1024,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/118108506396234113001/photos\">abhinav batra<\/a>"],"photo_reference":"CoQBcwAAAOWaUiokJHQrvY0t0xQPvLxhftUotoCnHcMRwgwv-wfidqAYz-Eoam5P3bJntCflo8I7GeQJFAdykAZCh7F3lzC6dVSeJGSKi72rVhbMxgQgQBwTWOO-YjuBr0awrMRM0BnDkFZKfvsArNJdUjEkf0US4eJoDaJpCU8GSPYu8TTHEhD38g-rzZGhkrvzESJCYNQiGhQk41fyWZ-IQhJ6zsjFPdSQV5TwRA","width":768}]
         * place_id : ChIJn4E6eEAeDTkRF2bVhc63xBA
         * rating : 4
         * reference : CmRRAAAAt5-zslQNVWJm4HqRR6--hFYFf1EE7MWsSC5-u_Z1-h-LcoYZxwN2_5N-_t3F2Rei4cSczYZjoeSSml5MrtsVg__Ou3AV3vFLBB6A35HMrInPHKTRNLh5fxKh8ITH1YhMEhCn9wOvawSGcd-xXPl3oRkbGhRtYfnBsIoTghYSTIFtXgcYc3XmkA
         * reviews : [{"aspects":[{"rating":1,"type":"overall"}],"author_name":"manish verma","author_url":"https://www.google.com/maps/contrib/108676299011711421878/reviews","language":"en","profile_photo_url":"https://lh6.googleusercontent.com/-lVongWbkhCM/AAAAAAAAAAI/AAAAAAAAAAA/AMcAYi97evoGmdZAyw5LyHViKXYsj5KGiA/s128-c0x00000000-cc-rp-mo/photo.jpg","rating":3,"relative_time_description":"a month ago","text":"Went to a wedding here.... it felt nothing great.... the place is ohkay.... maybe with a good decorator it could be better.... the property is fine....","time":1487005564},{"aspects":[{"rating":2,"type":"overall"}],"author_name":"maneet kaur","author_url":"https://www.google.com/maps/contrib/104581621344663510733/reviews","language":"en","profile_photo_url":"https://lh4.googleusercontent.com/-yY7JStBg4Ys/AAAAAAAAAAI/AAAAAAAAAB0/glHzaN7kZTQ/s128-c0x00000000-cc-rp-mo/photo.jpg","rating":4,"relative_time_description":"2 weeks ago","text":"Nice hotel.\nJuices were good","time":1490098399},{"aspects":[{"rating":2,"type":"overall"}],"author_name":"Amit Verma","author_url":"https://www.google.com/maps/contrib/103835461154520757255/reviews","language":"en","profile_photo_url":"https://lh5.googleusercontent.com/-2eqDjK1yELA/AAAAAAAAAAI/AAAAAAAAAAA/AMcAYi9kIgt4JOMtQrY0s_0KR-RAEnoSdA/s128-c0x00000000-cc-rp-mo-ba1/photo.jpg","rating":4,"relative_time_description":"2 weeks ago","text":"Nice food gud service ","time":1490278489},{"aspects":[{"rating":2,"type":"overall"}],"author_name":"Aaron Pereira","author_url":"https://www.google.com/maps/contrib/109955762833398639328/reviews","language":"en","profile_photo_url":"https://lh6.googleusercontent.com/-Bzsg93hEZtY/AAAAAAAAAAI/AAAAAAAAIRA/KW7C8iRmx9w/s128-c0x00000000-cc-rp-mo-ba1/photo.jpg","rating":4,"relative_time_description":"a month ago","text":"One of the majestic standalone wedding venues around here. ","time":1487706833},{"aspects":[{"rating":1,"type":"overall"}],"author_name":"Lakshay Handa","author_url":"https://www.google.com/maps/contrib/103557373801048291949/reviews","language":"en","profile_photo_url":"https://lh3.googleusercontent.com/-LR3AQYzO6r0/AAAAAAAAAAI/AAAAAAAAB6I/F1VsZbTEMnw/s128-c0x00000000-cc-rp-mo/photo.jpg","rating":3,"relative_time_description":"a month ago","text":"Food is not so good and service in critical","time":1486486376}]
         * scope : GOOGLE
         * types : ["lodging","point_of_interest","establishment"]
         * url : https://maps.google.com/?cid=1208292697678636567
         * utc_offset : 330
         * vicinity : Sultanpur Mandi Road, Manglapuri, Sultanpur, New Delhi
         * website : http://www.trillionhotel.com/
         */

        private String adr_address;
        private String formatted_address;
        private String formatted_phone_number;
        private GeometryBean geometry;
        private String icon;
        private String id;
        private String international_phone_number;
        private String name;
        private String place_id;
        private double rating;
        private String reference;
        private String scope;
        private String url;
        private int utc_offset;
        private String vicinity;
        private String website;
        private List<AddressComponentsBean> address_components;
        private List<PhotosBean> photos;
        private List<ReviewsBean> reviews;
        private List<String> types;

        public static ResultBean objectFromData(String str) {

            return new Gson().fromJson(str, ResultBean.class);
        }

        public String getAdr_address() {
            return adr_address;
        }

        public void setAdr_address(String adr_address) {
            this.adr_address = adr_address;
        }

        public String getFormatted_address() {
            return formatted_address;
        }

        public void setFormatted_address(String formatted_address) {
            this.formatted_address = formatted_address;
        }

        public String getFormatted_phone_number() {
            return formatted_phone_number;
        }

        public void setFormatted_phone_number(String formatted_phone_number) {
            this.formatted_phone_number = formatted_phone_number;
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

        public String getInternational_phone_number() {
            return international_phone_number;
        }

        public void setInternational_phone_number(String international_phone_number) {
            this.international_phone_number = international_phone_number;
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

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getUtc_offset() {
            return utc_offset;
        }

        public void setUtc_offset(int utc_offset) {
            this.utc_offset = utc_offset;
        }

        public String getVicinity() {
            return vicinity;
        }

        public void setVicinity(String vicinity) {
            this.vicinity = vicinity;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public List<AddressComponentsBean> getAddress_components() {
            return address_components;
        }

        public void setAddress_components(List<AddressComponentsBean> address_components) {
            this.address_components = address_components;
        }

        public List<PhotosBean> getPhotos() {
            return photos;
        }

        public void setPhotos(List<PhotosBean> photos) {
            this.photos = photos;
        }

        public List<ReviewsBean> getReviews() {
            return reviews;
        }

        public void setReviews(List<ReviewsBean> reviews) {
            this.reviews = reviews;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public static class GeometryBean {
            /**
             * location : {"lat":28.50377060000001,"lng":77.17230049999999}
             * viewport : {"northeast":{"lat":28.50506908029151,"lng":77.1737370302915},"southwest":{"lat":28.5023711197085,"lng":77.1710390697085}}
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
                 * lat : 28.50377060000001
                 * lng : 77.17230049999999
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
                 * northeast : {"lat":28.50506908029151,"lng":77.1737370302915}
                 * southwest : {"lat":28.5023711197085,"lng":77.1710390697085}
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
                     * lat : 28.50506908029151
                     * lng : 77.1737370302915
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
                     * lat : 28.5023711197085
                     * lng : 77.1710390697085
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

        public static class AddressComponentsBean {
            /**
             * long_name : Sultanpur Mandi Road
             * short_name : Sultanpur Mandi Rd
             * types : ["route"]
             */

            private String long_name;
            private String short_name;
            private List<String> types;

            public static AddressComponentsBean objectFromData(String str) {

                return new Gson().fromJson(str, AddressComponentsBean.class);
            }

            public String getLong_name() {
                return long_name;
            }

            public void setLong_name(String long_name) {
                this.long_name = long_name;
            }

            public String getShort_name() {
                return short_name;
            }

            public void setShort_name(String short_name) {
                this.short_name = short_name;
            }

            public List<String> getTypes() {
                return types;
            }

            public void setTypes(List<String> types) {
                this.types = types;
            }
        }

        public static class PhotosBean {
            /**
             * height : 1836
             * html_attributions : ["<a href=\"https://maps.google.com/maps/contrib/111118727863684205920/photos\">jyotish mishra<\/a>"]
             * photo_reference : CoQBdwAAALi68qsP__FiWDPwq4-sD1cgyKTU84qdB-CO7_f46D1t4l98Ul5KGo3-lsPNPZyuXOvCmMcDJOjS4r9g-88eNSHvV-bcOluEFOc3johKL1As3W0HdgEpYIkklxfe9PuWS_VNbcbuQHiQ4lMVXyj_g_jA-odXvip1UJGpLG6OoXqFEhCnviFnw-OWJPHOs0f2LN3FGhQl5LDwkIYqv8YJ6g1-8xadNM4X0A
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

        public static class ReviewsBean {
            /**
             * aspects : [{"rating":1,"type":"overall"}]
             * author_name : manish verma
             * author_url : https://www.google.com/maps/contrib/108676299011711421878/reviews
             * language : en
             * profile_photo_url : https://lh6.googleusercontent.com/-lVongWbkhCM/AAAAAAAAAAI/AAAAAAAAAAA/AMcAYi97evoGmdZAyw5LyHViKXYsj5KGiA/s128-c0x00000000-cc-rp-mo/photo.jpg
             * rating : 3
             * relative_time_description : a month ago
             * text : Went to a wedding here.... it felt nothing great.... the place is ohkay.... maybe with a good decorator it could be better.... the property is fine....
             * time : 1487005564
             */

            private String author_name;
            private String author_url;
            private String language;
            private String profile_photo_url;
            private int rating;
            private String relative_time_description;
            private String text;
            private int time;
            private List<AspectsBean> aspects;

            public static ReviewsBean objectFromData(String str) {

                return new Gson().fromJson(str, ReviewsBean.class);
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getAuthor_url() {
                return author_url;
            }

            public void setAuthor_url(String author_url) {
                this.author_url = author_url;
            }

            public String getLanguage() {
                return language;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public String getProfile_photo_url() {
                return profile_photo_url;
            }

            public void setProfile_photo_url(String profile_photo_url) {
                this.profile_photo_url = profile_photo_url;
            }

            public int getRating() {
                return rating;
            }

            public void setRating(int rating) {
                this.rating = rating;
            }

            public String getRelative_time_description() {
                return relative_time_description;
            }

            public void setRelative_time_description(String relative_time_description) {
                this.relative_time_description = relative_time_description;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public int getTime() {
                return time;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public List<AspectsBean> getAspects() {
                return aspects;
            }

            public void setAspects(List<AspectsBean> aspects) {
                this.aspects = aspects;
            }

            public static class AspectsBean {
                /**
                 * rating : 1
                 * type : overall
                 */

                private int rating;
                private String type;

                public static AspectsBean objectFromData(String str) {

                    return new Gson().fromJson(str, AspectsBean.class);
                }

                public int getRating() {
                    return rating;
                }

                public void setRating(int rating) {
                    this.rating = rating;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }
        }
    }
}
