//groovy语法

//1 可选的类型定义,分号可以去掉
def version = 1

//2可以使用断言  实际调用的是java中的equal方法 方法的括号可以不用，最后一个表达式的值作为返回值

assert version == 1

//3字符串  单引号表示一个字符串  双引号可以定义表达式   三个引号可以定义换行
def s1 = 'imooc'
def s2 = "groovy version is ${version}"
def s3 = '''hello
world'''

println s1
println s2
println s3

//4集合API
def buildTools = ['ant','maven']
println buildTools.getClass()
buildTools.add('gradle')
buildTools << 'groovy'
buildTools.toArray()

// map
def buildYears = ['ant':2000,'maven':2004]
buildYears.put('gradle',2017)
buildYears.groovy=2008
println buildYears.toString()
println buildYears.size()


//6闭包
def c1 = {
    println 'this is a closure'
}

def c2 = {
    params ->
        println "the params is ${params}"
}

def method1(Closure closure){
    closure()
}
def method2(Closure closure){
    closure(' closure2')
}

method1(c1)
method2(c2)

method1{
    println 'this is a inner closure'
}

method2{
    c2('inner closure params')
}



//示例  使用groovy 创建项目目录

// 1 创建一个闭包
def createDir = {
    path ->
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
}

def makeJavaClosure = {
    def paths = ['src/main/java','src/main/resources','src/test/java','src/test/resources'];
    paths.forEach(createDir)
}

def makeJavaDir(Closure closure){
    closure()
}
makeJavaDir(makeJavaClosure)


// 示例  使用groovy语法删除目录
// 1 创建一个闭包
def deleteDir = {
    path ->
        File file = new File(path);
        if(file.exists()){
            file.delete()
        }
}

def deleteJavaDir(Closure closure){
    closure()
}

deleteJavaDir{
    def paths = ['src/main/java','src/main/resources','src/test/java','src/test/resources'];
    paths.forEach(deleteDir)
}







