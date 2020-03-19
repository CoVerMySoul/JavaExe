debugger;
var data = this.data;
let formData = form.getFieldsValue()
let parentsName = formData.parentsName;
let parentsCode = formData.subRegionCode;
let subRegionName = formData.subRegionName;
if(data == 1){
    controls.parentsNameLabel.hide();
    controls.subRegionCodeLabel.hide();
    controls.subRegionNameLabel.hide();
    controls.parentsName.hide();
    controls.subRegionCode.hide();
    controls.subRegionName.hide();
    let formData = form.getFieldsValue()
    let parentsName = formData.parentsName;
//清除
    contrls.parentsName.setAttr(string,"");
}else{
    controls.parentsNameLabel.show();
    controls.subRegionCodeLabel.show();
    controls.subRegionNameLabel.show();
    controls.parentsName.show();
    controls.subRegionCode.show();
    controls.subRegionName.show();
//回显

}