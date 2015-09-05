// JavaScript Document

var value = new Array();
value[0] = ["1-3",2];/*第一个是数值，第二个是这一列表item对应图的第几行*/
value[1] = ["2-4",-1];
value[2] = ["5-7",-1];
value[3] = ["6",-1];
value[4] = ["8-10",-1];
value[5] = ["9-33",-1];
value[6] = ["11-13",7];
value[7] = ["12",-1];
value[8] = ["14",-1];
value[9] = ["15",6];
value[10] = ["16",-1];
value[11] = ["17-19",5];
value[12] = ["18-20",-1];
value[13] = ["21",-1];
value[14] = ["23-25",4];
value[15] = ["27-29",1];
value[16] = ["31",3];

var key = new Array();
key[0] = "道岔";
key[1] = "轨道";
key[2] = "信号机";

var BtnFlag = false;
function InitList()
{
	<!--var List = getElementById("List") List.innerHTML("<ul><li>1</li><li>2</li><li>3</li><li>4</li><li>5</li></ul>")-->
	var List = document.getElementById("List");
	var text = "";
	text = text + "<ul>";
	for (var i =0;i<3;i++)
	{
		text = text + "<li class = \"liTitle\" onclick=\"liTitleOnClick("+(i+1)+")\" id =\"liTitle\"><a href=\"javascript:void(0)\">"+key[i]+"</a></li>";
	}
	text = text + "</ul>";
	List.innerHTML=text;
}

function liTitleOnClick(index)
{
	var id = "List";
	var li = document.getElementById(id);
	var valLen = value.length;
	var keyLen = key.length;
	var htmlText = ""
	var listItemText = getListItem(index);
	for(var i=0;i<keyLen;i++)
	{
		htmlText = htmlText+"<li class = \"liTitle\" onclick=\"liTitleOnClick("+ (i+1)+")\" id =\"liTitle\"><a href=\"javascript:void(0)\">"+key[i]+"</a>";
		
		if(index == (i+1) && BtnFlag==false)
		{
			htmlText = htmlText + listItemText;
		}
		htmlText = htmlText + "</li>";
	}
	htmlText = "<ul>"+htmlText+"</ul>";
	BtnFlag = !BtnFlag;
	li.innerHTML=htmlText;
	
}

function getListItem(index)
{
	var  htmlText = ""
	if(index == 1)
	{
		var valLen = value.length;
		htmlText = htmlText +"<ul>";
		for(var j=0;j<valLen;j++)
		{
			var text = value[j][0];
			var Index = value[j][1];
			htmlText = htmlText+"<li class=\"liItem\"><a href=\"javascript:void(0)\" rowIndex = '"+value[j][1]+"'  onMouseOver=\"mouseOver(this)\" onMouseOut=\"mouseOut(this)\" onclick='ClickBranch(this)'>"+text+"</a></li>";
		}
		htmlText = htmlText +"</ul>";
		
	}
	else if(index == 2)
	{
		
	}
	else if(index == 3)
	{
		
	}
	return htmlText
}

function ClickBranch(e)
{
	var a = e.attributes["rowIndex"].nodeValue;
	var frame = document.getElementById("myFrame");
	frame.src="BranchPageFrame.html"+"?id="+a;
	
}

function mouseOver(e)
{
	e.style.backgroundColor = "F60";
	var row = e.attributes["rowIndex"].nodeValue;
	row = Number(row);
	ShowPath(row);
}

function mouseOut(e)
{
	e.style.backgroundColor = "";
	ClearColor();
}

function SearchStart()
{
	alert(" no date!");
}


var table = new Array();
table[0]=[1,1,"",1];/*行 列 数值 节点类型*/
table[1]=[1,2,"CH1HF7",4];
table[2]=[1,3,"",2];
table[3]=[1,4,"29#",5];
table[4]=[1,5,"",1];
table[5]=[1,6,"27#",5];
table[6]=[2,3,"",3];
table[7]=[2,4,"3#主",5];
table[8]=[2,5,"",1];
table[9]=[2,6,"3#副",5];
table[10]=[2,7,"",1];
table[11]=[2,8,"1#主",5];
table[12]=[2,9,"",1];
table[13]=[2,10,"1#副",5];
table[14]=[3,1,"",1];
table[15]=[3,2,"CH7HF7",4];
table[16]=[3,3,"",2];
table[17]=[3,4,"31#",5];
table[18]=[4,3,"",6];
table[19]=[4,4,"25#",5];
table[20]=[4,5,"",1];
table[21]=[4,6,"23#",5];
table[22]=[5,3,"",6];
table[23]=[5,4,"19#主",5];
table[24]=[5,5,"",1];
table[25]=[5,6,"19#副",5];
table[26]=[5,7,"",1];
table[27]=[5,8,"17#主",5];
table[28]=[5,9,"",1];
table[29]=[5,10,"17#副",5];
table[30]=[6,3,"",3];
table[31]=[6,4,"CH5HF4",4];
table[32]=[6,5,"",2];
table[33]=[6,6,"15#",5];
table[34]=[7,5,"",3];
table[35]=[7,6,"13#主",5];
table[36]=[7,7,"",1];
table[37]=[7,8,"13#副",5];
table[38]=[7,9,"",1];
table[39]=[7,10,"11#主",5];
table[40]=[7,11,"",1];
table[41]=[7,12,"11#副",5];

var BranchKey = new Array();
BranchKey[0] = [1,2];
BranchKey[1] = [3,4,5,6,7];
BranchKey[2] = [6,7];

function CreateDivTable(row,col,height,width)
{
	var tableContent = document.getElementById("RightTable");
	var htmlText = "";
	for(var i =1;i<=row;i++)
	{
		for(var j=1;j<=col;j++)
		{
			var rowStr = i.toString();
			var colStr = j.toString();
			if(j%2==0)
			{
				htmlText = htmlText+"<div class='CellStyle' id ='cell" + i+j+ "'></div>" 	
			}
			else
			{
				htmlText = htmlText+"<div class='CellStyleL' id ='cell" + i+j+ "'></div>" 
			}
		}	
	}
	tableContent.innerHTML = htmlText
	CreateStructure()
}

function CreateShape(index,content,type)
{
	var cell = document.getElementById("cell"+index);
	var text = "";
	if(type==1)/*横线*/
	{
		text = "<div class='THShape ColorBg'></div>";
	}
	else if(type==2)/*T字形*/
	{
		text = "<div class='THShape ColorBg'></div><div class='TVShape ColorBg'></div>";
	}
	else if(type==3)/*L字形*/
	{
		text = "<div class='LShapContent'><div class='LHShape ColorBg'></div><div class='LVShape ColorBg'></div></div>";
	}
	else if(type==4)/*分支*/
	{
		text = "<div class='Branch ColorBg' onMouseOver='nodeMouseOver(this)' onMouseOut='nodeMouseOut(this)' onclick='nodeClickBranch("+index+")'><div class='BranchFont' Row ='"+index+"'><a class='nodeContent' herf='javascript:void(0)'>"+content+"</a></div></div>";
	}
	else if(type==5)/*节点*/
	{
		text = "<div class='Node ColorBg' onMouseOver='nodeMouseOver(this)' onMouseOut='nodeMouseOut(this)' onclick='nodeClickBranch("+index+")'><div class='NodeFont' Row='"+index+"'><a class='nodeContent' herf='javascript:void(0)'>"+content+"</a></div></div>";
	}
	else if(type==6)/**/
	{
		text = "<div class='LeftTContent'><div class='LeftTV ColorBg'></div><div class='LeftTH ColorBg'></div></div>";
	}
	else
	{
	}
	cell.innerHTML = text;
}


function nodeMouseOver(e)
{
	e.style.backgroundColor="#F60";
}

function nodeMouseOut(e)
{
	e.style.backgroundColor="#3CF";
}

function nodeClickBranch(index)
{
	var str = index.toString();
	var row = str.substr(0,1);
	var frame = window.parent.document.getElementById("myFrame");
	frame.src="DetailPageFrame.html"+"?id="+row;
}

function CreateStructure()
{
	for(var i=0;i<table.length;i++)
	{
		var row = table[i][0];
		var col = table[i][1];
		var value = table[i][2];
		var type = table[i][3];
		var index = row.toString()+col.toString();
		CreateShape(index,value,type);
	}
}

function GetBranch(row)
{
	var branchArray = new Array();
	for(var i=0;i<BranchKey.length;i++)
	{
		for(var j=0;j<BranchKey[i].length;j++)
		{
			if(row==BranchKey[i][j])
			{
				branchArray.push(i);
			}
		}
	}
	var indexArray = new Array();
	for(var i=0;i<branchArray.length;i++)
	{
		var branch = branchArray[i];
		if(branch==0)
		{
			indexArray.push("12");	
		}
		else if(branch==1)
		{
			indexArray.push("32");
		}
		else if(branch==2)
		{
			indexArray.push("64");
		}
	}
	return indexArray;
}

function ShowPath(row)
{
	var tab = GetSameRowNodeIndex(row);
	ChangeNodeColor(tab);
}

function GetSameRowNodeIndex(row)
{
	var indexArr = new Array();
	for(var i = 0;i<table.length;i++)
	{
		if(row==table[i][0]&&table[i][1]%2==0)
		{
			var index = table[i][0].toString()+table[i][1].toString();
			indexArr.push(index);
		}	
	}
	var branch = GetBranch(row);
	indexArr = indexArr.concat(branch);
	var text = "Totle Index"
	for(var i=0;i<indexArr.length;i++)
	{
		text = text+indexArr[i]+" ";
	}
	return indexArr;
}

function ChangeNodeColor(tab)
{

	for(var i=0;i<tab.length;i++)
	{
		var d = myFrame.window.document.getElementById("cell"+tab[i]);
		/*alert("ChangeNodeColor "+"cell"+tab[i] +tab.length);*/
		var colBg = d.getElementsByClassName("ColorBg");
		for(var j=0;j<colBg.length;j++)
		{
			colBg[j].style.backgroundColor="#F60";
		}
	}
}

function ClearColor()
{
	var colBg = myFrame.window.document.getElementsByClassName("ColorBg");
	for(var j=0;j<colBg.length;j++)
		{
			colBg[j].style.backgroundColor="#3CF";
		}

}




function BCreateShape(index,content,type)
{
	var cell = document.getElementById("BCell"+index);
	var text = "";
	if(type==1)/*横线*/
	{
		text = "<div class='BTHShape ColorBg'></div>";
	}
	
	else if(type==4)/*分支*/
	{
		text = "<div class='BBranch ColorBg'><div class='BBranchFont'><p>"+content+"</p></div></div>";
	}
	else if(type==5)/*节点*/
	{
		text = "<div class='BNode ColorBg'><div class='BNodeFont'>"+content+"</div></div>";
	}
	else
	{
	}
	cell.innerHTML = text;
}

function GetSameRowIndex(row)
{
	var indexArr = new Array();
	for(var i = 0;i<table.length;i++)
	{
		if(row==table[i][0]&&table[i][1]%2==0)
		{
			indexArr.push(i);
		}	
	}
	var branch = GetBranchIndex(row);
	branch = branch.concat(indexArr);
	var text = "Totle Index"
	for(var i=0;i<indexArr.length;i++)
	{
		text = text+indexArr[i]+" ";
	}
	return branch;
}

function GetBranchIndex(row)
{
	var branchArray = new Array();
	for(var i=0;i<BranchKey.length;i++)
	{
		for(var j=0;j<BranchKey[i].length;j++)
		{
			if(row==BranchKey[i][j])
			{
				branchArray.push(i);
			}
		}
	}
	var indexArray = new Array();
	for(var i=0;i<branchArray.length;i++)
	{
		var branch = branchArray[i];
		if(branch==0)
		{
			indexArray.push(1);	
		}
		else if(branch==1)
		{
			indexArray.push(15);
		}
		else if(branch==2)
		{
			indexArray.push(31);
		}
	}
	return indexArray;
}

function GetBranchId(tag)
{
	var urlinfo=window.location.href; //获取当前页面的url 
	var len=urlinfo.length;//获取url的长度 
	var offset=urlinfo.indexOf("?");//设置参数字符串开始的位置 
	var newsidinfo=urlinfo.substr(offset,len)//取出参数字符串 这里会获得类似“id=1”这样的字符串 
	var newsids=newsidinfo.split("=");//对获得的参数字符串按照“=”进行分割 
	var newsid=newsids[1];//得到参数值 
	/*alert("您要传递的参数值是"+newsid);*/
	InitBranch(12);
	CreateBranch(newsid);
	registerEvent(tag);
	
}

function InitBranch(col)
{
	var div = document.getElementById("BranchStruct");
	var text = ""
	for(var i = 0;i<col;i++)
	{
		if(i%2==0)
		{
			text = text+"<div class='BCellStyle' id = 'BCell"+(i+1)+"'></div>";	
		}
		else
		{
			text = text+"<div class='BCellStyleL' id = 'BCell"+(i+1)+"'></div>";
		}
	}
	div.innerHTML = text;
}

function CreateBranch(row)
{
	BCreateShape(1,"分线盘",5);
	BCreateShape(2,"",1);
	var text = "";
	var array = GetSameRowIndex(row);
	var infoIndex = 0;
	for(var i=0;i<(array.length+array.length-1);i++)
	{
		if(i%2==0)
		{
			var info = table[array[infoIndex]];
			BCreateShape(i+3,info[2],info[3]);
			infoIndex = infoIndex +1
		}
		else
		{
			BCreateShape(i+3,"",1);
		}
	}
}


function ImgShow(evt){
 var imgTag=(window.event)?event.srcElement:evt.target;
 var srcLentght = imgTag.src.length;
 var imgPath=imgTag.src.substr(0,srcLentght-4);/* "images/Image 26 at frame 17.png";/*imgTag.src.replace(/^\.$/,"_4.");//取得弹出的大图url*/
 imgPath = imgPath+"_da.jpg";
 var tagTop=Math.max(document.documentElement.scrollTop,document.body.scrollTop);
 var tag=document.createElement("div");
  tag.style.cssText="width:100%;height:"+Math.max(document.body.clientHeight,document.body.offsetHeight,document.documentElement.clientHeight)+"px;position:absolute;background:black;top:0;filter: Alpha(Opacity=50);Opacity:0.5;";
  tag.ondblclick=closes;
 var tagImg=document.createElement("div");
  tagImg.style.cssText="font:12px /18px verdana;overflow:auto;text-align:center;position:absolute;width:200px;border:5px solid white;background:white;color:white;left:"+(parseInt(document.body.offsetWidth)/2-100)+"px;top:"+(document.documentElement.clientHeight/3+tagTop)+"px;"
  tagImg.innerHTML="<div style='padding:10px;background:#cccccc;border:1px solid white'><img src='/jscss/demoimg/loading.gif' /><br /><br /><b style='color:#999999;font-weight:normal'>Image loading...</b><br /></div>";
  tagImg.oncontextmenu=function(){var clsOK=confirm("确定要取消图片显示吗?点击确定将关闭图片。\n如果您是想缩放图片请在图片上双击。"); if(clsOK){closes();};return false};
 var closeTag=document.createElement("div");
  closeTag.style.cssText="display:none;position:absolute;left:10px;top:10px;color:black;";
  var closesHtml="<b style='background:red;border:1px solid white;filter:Alpha(Opacity=50);Opacity:0.5;cursor:pointer;'>&nbsp;关闭&nbsp;</b>";
  closeTag.innerHTML=closesHtml+" 提示:双击图片缩放";
  closeTag.onclick=closes;
 document.body.appendChild(tag);
 document.body.appendChild(tagImg);
 var img=new Image();
  img.src=imgPath;
  img.style.cssText="border:1px solid #cccccc;filter: Alpha(Opacity=0);Opacity:0;cursor:pointer";
 var barShow,imgTime;
 img.complete?ImgOK():img.onload=ImgOK;
 function ImgOK(){
  var Stop1=false,Stop2=false,temp=0;
  var tx=tagImg.offsetWidth,ty=tagImg.offsetHeight;
  var ix=img.width,iy=img.height;
  var sx=document.documentElement.clientWidth,sy=window.innerHeight||document.documentElement.clientHeight;
  if(iy>sy||ix>sx){
    var yy=sy-100;
    var xx=(ix/iy)*yy;
  }else{
   var xx=ix+4;
   var yy=iy+3;
  }
   img.style.width=xx-4+'px';
   img.style.height=yy-3+'px';
  if(ix<sx&&iy<sy){tagImg.alt="";closeTag.innerHTML=closesHtml;};
  var maxTime=setInterval(function(){
   temp+=35;
   if((tx+temp)<xx){
    tagImg.style.width=(tx+temp)+"px";
    tagImg.style.left=(sx-(tx+temp))/2+"px";
   }else{
    Stop1=true;
    tagImg.style.width=xx+"px";
    tagImg.style.left=(sx-xx)/2+"px";
   }
   if((ty+temp)<yy){
    tagImg.style.height=(ty+temp)+"px";
    tagImg.style.top=(tagTop+((sy-(ty+temp))/2))+"px";
   }else{
    Stop2=true;
    tagImg.style.height=yy+"px";
    tagImg.style.top=(tagTop+((sy-yy)/2))+"px";
   }
   if(Stop1&&Stop2){
    clearInterval(maxTime);
    tagImg.appendChild(img);
    temp=0;
    imgOPacity();
   }
  },1);
  function imgOPacity(){
   temp+=10;
   img.style.filter="alpha(opacity="+temp+")";
   img.style.opacity=temp/100;
   imgTime=setTimeout(imgOPacity,1)
   if(temp>100) clearTimeout(imgTime);
  }
  tagImg.innerHTML="";
  tagImg.appendChild(closeTag);
   
  if(ix>xx||iy>yy){
   img.alt="左键拖动,双击放大缩小";
   img.ondblclick=function (){
    if(tagImg.offsetWidth<img.offsetWidth||tagImg.offsetHeight<img.offsetHeight){
     img.style.width="auto";
     img.style.height="100%";
     img.alt="双击可以放大";
     img.onmousedown=null;
     closeTag.style.top="10px";
     closeTag.style.left="10px";
     tagImg.style.overflow="visible";
     tagImg.style.width=img.offsetWidth+"px";
     tagImg.style.left=((sx-img.offsetWidth)/2)+"px";
    }else{
     img.style.width=ix+"px";
     img.style.height=iy+"px";
     img.alt="双击可以缩小";
     img.onmousedown=dragDown;
     tagImg.style.overflow="auto";
     tagImg.style.width=(ix<sx-100?ix+20:sx-100)+"px";
     tagImg.style.left=((sx-(ix<sx-100?ix+20:sx-100))/2)+"px";
    }
   }
   img.onmousedown=dragDown;
   tagImg.onmousemove=barHidden;
   tagImg.onmouseout=moveStop;
   document.onmouseup=moveStop;
  }else{
   tagImg.style.overflow="visible";
   tagImg.onmousemove=barHidden;
  }
 }
 function dragDown(a){
  img.style.cursor="move";
  var evts=a||window.event;
  var onx=evts.clientX,ony=evts.clientY;
  var sox=tagImg.scrollLeft,soy=tagImg.scrollTop;
  var sow=img.width+2-tagImg.clientWidth,soh=img.height+2-tagImg.clientHeight;
  var xxleft,yytop;
  document.onmousemove=function(e){
   var evt=e||window.event;
   xxleft=sox-(evt.clientX-onx)<0?"0":sox-(evt.clientX-onx)>sow?sow:sox-(evt.clientX-onx);
   yytop=soy-(evt.clientY-ony)<0?"0":soy-(evt.clientY-ony)>soh?soh:soy-(evt.clientY-ony);
   tagImg.scrollTop=yytop;
   tagImg.scrollLeft=xxleft;
   closeTag.style.top=(yytop+10)+"px";
   closeTag.style.left=(xxleft+10)+"px";
   return false;
  }
  return false;
 }
 function barHidden(){
  clearTimeout(barShow);
  closeTag.style.top=(tagImg.scrollTop+10)+"px";
  closeTag.style.left=(tagImg.scrollLeft+10)+"px";
  if(closeTag.style.display=="none")closeTag.style.display="block";
  barShow=setTimeout(function(){closeTag.style.display="none";},1000);
 }
 function closes(){
  document.body.removeChild(tag);
  document.body.removeChild(tagImg);
  clearTimeout(barShow);
  clearTimeout(imgTime);
  document.onmouseup=null;
  tag=img=tagImg=closeTag=null;
 }
 function moveStop(){
  document.onmousemove=null;
  tagImg.onmousemove=barHidden;
  img.style.cursor="pointer";
 }
}

var ImgShowDetailFlag =false

function ImgShowDetail()
{
	var div = document.getElementById("BranchBottom");
	var text = ""
	if(ImgShowDetailFlag)
	{
		text = "<div class='imageShow'><img src='images/4.png' width='377' height='349' /><span>17#岔道</span></div><div class='imageShow'><img src='images/5.png' width='378' height='350' /><span>19#岔道</span></div>";
	}
	else
	{
		text = "<div class='imgDetail'><img src='images/Image 63 at frame 17.png' width='712' height='527' /> </div>";
	}
	div.innerHTML = text;
	ImgShowDetailFlag =  !ImgShowDetailFlag;
}

function registerEvent(tag)
{
	if(tag==1)
	{
		if(document.getElementById("workDemo")){
			var workTag=document.getElementById("workDemo");
			var workImg=workTag.getElementsByTagName("img"); //注册此处会把 workDemo下的所有img选中，包括子集下的子集。
			var worka=workTag.getElementsByTagName("a");
			var workspan=workTag.getElementsByTagName("span");
			for(var i=0; i<workImg.length; i++)
			{
				if(i==0)
				{
					workImg[i].onclick=ImgShow;
					workspan[i].onclick=ImgShow;
				}
				else
				{
					workImg[i].onclick=ImgShowDetail;
					workspan[i].onclick=ImgShowDetail;
				}
				worka[i].href="##";
				
			}
		}
	}
	else
	{
		if(document.getElementById("DWorkDemo")){
			var workTag=document.getElementById("DWorkDemo");
			var workImg=workTag.getElementsByTagName("img"); //注册此处会把 workDemo下的所有img选中，包括子集下的子集。
			var worka=workTag.getElementsByTagName("a");
			var workspan=workTag.getElementsByTagName("span");
			for(var i=0; i<workImg.length; i++)
			{
			
					workImg[i].onclick=ImgShow;
					workspan[i].onclick=ImgShow;
				worka[i].href="##";
				
			}
		}
	}
}


var imgArray = new Array();
imgArray[0] = ["images/Image 31 at frame 17.png",""];
imgArray[1] = ["images/Image 32 at frame 17.png","images/Image 28 at frame 17.png"];
imgArray[2] = ["images/Image 37 at frame 17.png",""];
imgArray[3] = ["images/Image 32 at frame 17.png","images/Image 28 at frame 17.png"];

var pageIndex = 0;

function preImage()
{
	pageIndex=pageIndex - 1
	if(pageIndex<0)
	{
		pageIndex = 0
	}
	showDetailImg(pageIndex)
}

function nextImage()
{
	pageIndex=pageIndex + 1
	if(pageIndex>1)
	{
		pageIndex = 1
	}
	showDetailImg(pageIndex)
}

function showDetailImg(pageIndex)
{
	
	var divIndex = 1
	for(var i=pageIndex;i<pageIndex+3;i++)
	{
		var text = ""
		var div = document.getElementById("DetailImg"+divIndex);
		text = "<img src='"+imgArray[i][0]+"'/><img src='"+imgArray[i][1]+"'/>";
		div.innerHTML = text;
		divIndex = divIndex + 1;
		
	}
}