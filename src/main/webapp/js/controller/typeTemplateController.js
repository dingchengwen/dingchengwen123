app.controller('typeTemplateController',function ($scope,$controller,typeTemplateService,brandService,specificationService) {
    $controller('baseController',{$scope:$scope});

    //{data:[{id:1,text:'联想'},{id:2,text:'华为'},{id:3,text:'小米'}]};
    $scope.brandList= function () {
        //这个是品牌，要查询需要去品牌的service去里面去查询，引入品牌的service
        brandService.getBrandList().success(function (response) {
            //我们查询出来的数据是集合  格式是[{id:1,text:'联想'},{id:2,text:'华为'},{id:3,text:'小米'}]
            //但是select2需要的是   {data:数据}
            alert(response);
            $scope.brandList = {data:response};
        });
    }

    $scope.findOne = function(id){
        typeTemplateService.findOne(id).success(function (response) {
            $scope.entity = response;
            $scope.entity.brandIds=JSON.parse($scope.entity.brandIds);
            $scope.entity.specIds=JSON.parse($scope.entity.specIds);
            /**
             * 修改的时候，方式这个为空，在转json的时候，异常了，导致出现问题
             */
            if($scope.entity.customAttributeItems==null){
                $scope.entity.customAttributeItems=[];
            }else{
                $scope.entity.customAttributeItems= JSON.parse($scope.entity.customAttributeItems);
            }

        });
    }

    $scope.addTableRow = function(){
        $scope.entity.customAttributeItems.push({});
    }

    $scope.deleTableRow  =function(index){
        $scope.entity.customAttributeItems.splice(index,1);
    }

    $scope.specList= function () {
        //这个是品牌，要查询需要去品牌的service去里面去查询，引入品牌的service
        specificationService.getSpecList().success(function (response) {
            $scope.specList = {data:response};
        });
    }

    $scope.search = function (searchEntity,page,rows) {
        typeTemplateService.search(searchEntity,page,rows).success(function (response) {
            $scope.list = response.rows;
            $scope.paginationConf.totalItems=response.total;
        });
    }
    $scope.dele = function () {
        typeTemplateService.dele($scope.selectIds).success(function (response) {
            if(response.success){
                $scope.reloadList();
            }else{
                alert(response.message);
            }
        });
    }
    $scope.jsonToString = function (jsonString,key) {
        //我们要把我们的json的字符串转成json数组
        var json = JSON.parse(jsonString);
        //最后要返回一个字符串
        var rs="";
        for(var x=0;x<json.length;x++){
            if(x>0){
                rs+=",";
            }
            rs+= json[x][key];
        }
        return rs;
    }
    
    
    $scope.save = function () {
        typeTemplateService.save($scope.entity).success(function (response) {
            if(response.success){
                $scope.reloadList();
            }else{
                alert(response.message);
            }
        });
    }
})