package com.wd.health.bean;

public class PatientBean {


    /**
     * result : {"benefitTaboo":" 1．应经常运动，可维持骨骼的力量，并防止发生骨质疏松症。 2．多吃富含钙质及维生素D的食物。 3．要预防跌倒；如果站立不稳，要使用手杖；将松脱的地毯或电线等容易使人绊倒的危险物移开；即使是在夜间，也要保持屋内光亮等。 4．骨质疏松症一旦确定，想要使它逆转相当困难，而且在诊断确定前发生的损害，通常都是永久性的。但你不应放弃努力，可使用激素、钙剂及氟化物治疗，可使病情的发展缓慢下来，甚至停止。","chineseMedicineTreatment":" 1．服用知柏地黄丸、人参归脾丸或人参养荣丸等中成药治疗。 2．女贞子、菟丝子、枸杞子、山药、补骨脂、黄芪、茯苓、牛膝各适量，煎汤内服，连服9~11个月。 3．采用补肾方药，如六味地黄丸、左归饮等。 4．可服用抗骨松冲剂能达到益肾壮骨的作用。","createTime":1547108499000,"diseaseCategoryId":26,"id":26,"pathology":"骨质疏松症是因骨骼中的老骨组织的破坏速度超过了新骨组织的生产速度，造成骨细胞的代谢平衡被打破，从而使骨骼变得松软无力，发生耗损或退变。老年人常发生此病。发生骨质疏松症的原因有：①骨折；②激素疾病；③饮食中蛋白质及钙的含量低；④骨软化；⑤骨老化；⑥女性绝经。","symptom":"骨质疏松症发生在背椎骨时，患者会出现背痛，身高变矮，肩膀则变成了圆形。在罕见的病例中，会发生严重的背痛。骨质疏松症造成骨骼衰弱，易发生骨折。","westernMedicineTreatment":" 1．服葡萄糖酸钙或乳酸钙，每日800毫克左右，但应遵医嘱。 2．补充钙制剂和维生素D。钙剂可用活性钙、碳酸钙等。 3．雌激素治疗常用的有乙烯雌酚，现多推荐用尼尔雌醇，每片含2毫克，每次1~2毫克，每月1~2次，副作用少。激素疗法要遵医嘱用药，单用雌激素有可能诱发子宫出血，或增加患乳腺癌的机会。许多医生认为，对大部分妇女来说，如与黄体酮结合起来使用，会减少此种顾虑。 4．可用鲑降钙素（商品名叫密钙息）做降钙治疗，它有两个剂型，为注射剂和雾化剂。"}
     * message : 查询成功
     * status : 0000
     */

    private ResultBean result;
    private String message;
    private String status;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class ResultBean {
        /**
         * benefitTaboo :  1．应经常运动，可维持骨骼的力量，并防止发生骨质疏松症。 2．多吃富含钙质及维生素D的食物。 3．要预防跌倒；如果站立不稳，要使用手杖；将松脱的地毯或电线等容易使人绊倒的危险物移开；即使是在夜间，也要保持屋内光亮等。 4．骨质疏松症一旦确定，想要使它逆转相当困难，而且在诊断确定前发生的损害，通常都是永久性的。但你不应放弃努力，可使用激素、钙剂及氟化物治疗，可使病情的发展缓慢下来，甚至停止。
         * chineseMedicineTreatment :  1．服用知柏地黄丸、人参归脾丸或人参养荣丸等中成药治疗。 2．女贞子、菟丝子、枸杞子、山药、补骨脂、黄芪、茯苓、牛膝各适量，煎汤内服，连服9~11个月。 3．采用补肾方药，如六味地黄丸、左归饮等。 4．可服用抗骨松冲剂能达到益肾壮骨的作用。
         * createTime : 1547108499000
         * diseaseCategoryId : 26
         * id : 26
         * pathology : 骨质疏松症是因骨骼中的老骨组织的破坏速度超过了新骨组织的生产速度，造成骨细胞的代谢平衡被打破，从而使骨骼变得松软无力，发生耗损或退变。老年人常发生此病。发生骨质疏松症的原因有：①骨折；②激素疾病；③饮食中蛋白质及钙的含量低；④骨软化；⑤骨老化；⑥女性绝经。
         * symptom : 骨质疏松症发生在背椎骨时，患者会出现背痛，身高变矮，肩膀则变成了圆形。在罕见的病例中，会发生严重的背痛。骨质疏松症造成骨骼衰弱，易发生骨折。
         * westernMedicineTreatment :  1．服葡萄糖酸钙或乳酸钙，每日800毫克左右，但应遵医嘱。 2．补充钙制剂和维生素D。钙剂可用活性钙、碳酸钙等。 3．雌激素治疗常用的有乙烯雌酚，现多推荐用尼尔雌醇，每片含2毫克，每次1~2毫克，每月1~2次，副作用少。激素疗法要遵医嘱用药，单用雌激素有可能诱发子宫出血，或增加患乳腺癌的机会。许多医生认为，对大部分妇女来说，如与黄体酮结合起来使用，会减少此种顾虑。 4．可用鲑降钙素（商品名叫密钙息）做降钙治疗，它有两个剂型，为注射剂和雾化剂。
         */

        private String benefitTaboo;
        private String chineseMedicineTreatment;
        private long createTime;
        private int diseaseCategoryId;
        private int id;
        private String pathology;
        private String symptom;
        private String westernMedicineTreatment;

        public String getBenefitTaboo() {
            return benefitTaboo;
        }

        public void setBenefitTaboo(String benefitTaboo) {
            this.benefitTaboo = benefitTaboo;
        }

        public String getChineseMedicineTreatment() {
            return chineseMedicineTreatment;
        }

        public void setChineseMedicineTreatment(String chineseMedicineTreatment) {
            this.chineseMedicineTreatment = chineseMedicineTreatment;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public int getDiseaseCategoryId() {
            return diseaseCategoryId;
        }

        public void setDiseaseCategoryId(int diseaseCategoryId) {
            this.diseaseCategoryId = diseaseCategoryId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPathology() {
            return pathology;
        }

        public void setPathology(String pathology) {
            this.pathology = pathology;
        }

        public String getSymptom() {
            return symptom;
        }

        public void setSymptom(String symptom) {
            this.symptom = symptom;
        }

        public String getWesternMedicineTreatment() {
            return westernMedicineTreatment;
        }

        public void setWesternMedicineTreatment(String westernMedicineTreatment) {
            this.westernMedicineTreatment = westernMedicineTreatment;
        }
    }
}
