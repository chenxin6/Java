# Maven的教程
## 项目构建的环节
通常项目构建有以下环节：清理->编译->测试->报告->打包->安装->部署
1. 清理：删除以前的编译结果，为重新编译做好准备
2. 编译：将Java源程序编译为字节码文件
3. 测试：针对项目中的关键点进行测试，确保项目在迭代开发过程中关键点的正确性
4. 报告：在每一次测试后以标准的格式记录和展示测试结果
5. 打包：将一个包含诸多文件的工程封装为一个压缩文件用于安装或部署。Java工程对应jar包，Web工程对应war包
7. 安装：在Maven环境下特指将打包的结果jar包或war包安装到本地仓库中
8. 部署：将打包的结果部署到远程仓库或将war包部署到服务器上运行
## Maven的核心概念
Maven的九个核心概念：①POM（Project Object Model：项目对象模型）②约定的目录结构③坐标④依赖管理⑤仓库管理⑥生命周期⑦插件和目标⑧继承⑨聚合
## 约定的目录结构
现在JavaEE开发领域普遍认同的一个观点：约定>配置>编码
- Hello（工程名作为根目录）
    + src（源码目录）
        * main（主程序目录）
            - java（Java源文件目录）
            - resources（资源文件目录）
        * test（测试程序目录）
            - java（Java源文件目录）
            - resources（资源文件目录）
    + target（编译结果）
    + pom.xml（Maven配置文件）
## 坐标
Maven的坐标使用如下三个向量在Maven的仓库中唯一的确定一个Maven工程（gav）
1. groupId：公司或组织的域名倒序+当前项目名称
2. artifactId：当前项目的模块名称
3. version：当前模块的版本

例如：
```
<groupId>cn.edu.ustc.nsrl.maven</groupId>
<artifactId>Hello</artifactId>
<version>0.0.1-SNAPSHOT</version>
```
__注意:我们自己的Maven工程必须执行安装操作才会进入仓库。安装的命令是：mvn install__
## 依赖
Maven中最关键的部分，当A jar包用到了B jar包中的某些类时，A就对B产生了依赖，在Maven中使用dependency标签指定被依赖jar包的坐标就可以了
例如：
```
<dependency>
    <groupId>cn.edu.ustc.nsrl.maven</groupId>
    <artifactId>Hello</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>  
```
依赖信息除了jar包坐标，还有一个scope设置，这是依赖范围，它可以选填compile、test、provided三个 __（依赖具有传递性，但非compile范围的不能传递）__
1. compile针对main（主程序）和test（测试程序）
2. test只针对test（测试程序），例如junit的jar包只有测试程序才会用到，则其依赖的范围配置应该为test

依赖的原则：解决jar包冲突

比如A依赖B，B依赖C；然后D依赖C。在这个场景中导入依赖A和D都会导入C __（由于传递性）__，这就造成了冲突，此时有两个原则来解决
1. 路径最短者优先
2. 路径相同时先声明者优先 __（声明的先后顺序指的是dependency标签配置的先后顺序）__
## 仓库
仓库大体上分为两种：本地仓库和远程仓库
1. 本地仓库：为当前本机电脑上的所有Maven工程服务，默认在 _~/.m2/repository_
2. 远程仓库：分为私服、中央仓库、中央仓库镜像
    - 私服：架设在当前局域网环境下，为当前局域网范围内的所有Maven工程服务
    - 中央仓库：架设在Internet上，为全世界所有Maven工程服务
    - 中央仓库的镜像：架设在各个大洲，为中央仓库分担流量，减轻中央仓库的压力

仓库中的文件有：Maven的插件、我们自己开发的项目模块、第三方框架或工具的jar包 __（不管是什么样的jar包，在仓库中都是按照坐标生成目录结构，所以可以通过统一的方式查询）__
## 生命周期
Maven生命周期定义了各个构建环节的执行顺序，有了这个清单，Maven就可以自动化的执行构建命令了。Maven有三套相互独立的生命周期，分别是：
1. Clean Lifecycle 在进行真正的构建之前进行一些清理工作
2. Default Lifecycle 构建的核心部分，编译，测试，打包，安装，部署等等
3. Site Lifecycle 生成项目报告，站点，发布站点

这三套生命周期是相互独立的，你可以仅仅调用clean来清理工作目录，仅仅调用site来生成站点，当然你也可以直接运行mvn clean install site运行所有这三套生命周期，每套生命周期都由一组阶段（Phase）组成，我们平时在命令行输入的命令总会对应于一个特定的阶段，比如运行mvn clean就是运行到Clean生命周期中的clean这个阶段后结束。__Default生命周期是最重要的，绝大部分工作都发生在这个生命周期中__
## 插件和目标
Maven的核心仅仅定义了抽象的生命周期，具体的任务都是交由插件来完成的，每个插件都能实现多个功能，每个功能就是一个插件目标，Maven的生命周期与插件目标互相绑定，以完成某个具体的构建任务，例如:
1. compile就是插件maven-compile-plugin的一个目标
2. pre-clean是插件maven-clean-plugin的一个目标
## 继承
由于非compile范围的依赖信息不能在“依赖链”中传递，所以有需要的工程只能单独配置，例如junit，为了统一这些模块的管理，要么到各个工程中手动修改 __（不可取）__，要么使用继承机制 __（将这些依赖信息统一提取到父工程模块中管理）__。具体方法步骤如下：
1. 创建父工程：创建父工程和创建一般的Maven工程操作一致，唯一需要注意的是：打包方式处要设置为pom
2. 在子工程中引用父工程：此时如果子工程的groupId和version和父工程的重复则可以删除
3. 在父工程中管理依赖
4. 在子项目中重新指定需要的依赖，删除范围和版本号 __（如果相同的话）__
## 聚合
将多个工程拆分为模块后，需要手动逐个安装到仓库后依赖才能够生效。修改源码后也需要逐个手动进行clean操作。而使用了聚合之后就可以批量进行Maven工程的安装、清理工作。 __在总的聚合工程中使用modules标签指定模块工程的相对路径即可实现聚合的功能__ 
## 查询Maven依赖信息的网站
http://mvnrepository.com/搜索需要的jar包的依赖信息
# Maven的使用
## 安装
1. 检查JAVA_HOME环境变量
2. 解压Maven的核心程序
3. 配置环境变量M2_HOME和path中加上bin的路径
4. 检查安装是否成功mvn -v
## 修改本地仓库
默认本地仓库位置是 _~/.m2/repository_，如果想修改到别的目录只需修改Maven根目录下conf目录中的settings.xml文件，添加如下内容即可
```
<localRepository>路径</localRepository>
```
## 修改默认的JDK版本
1. 打开settings.xml文件
2. 找到profiles标签
3. 加入如下配置即可
```
<profile>
	<id>jdk-1.8</id>
	<activation>
		<activeByDefault>true</activeByDefault>
		<jdk>1.8</jdk>
	</activation>
	<properties>
		<maven.compiler.source>1.8</maven.compiler.source>
		<maven.compiler.target>1.8</maven.compiler.target>
		<maven.compiler.compilerVersion>1.8</maven.compiler.compilerVersion>
	</properties>
</profile>
```
## Eclipse中创建Maven工程
1. 更改Eclipse配置
    - Preferences->Maven->User Setting将User Settings设置成settings.xml的路径，将Local Repository设置成实际的仓库路径
    - Preferences->Maven->Installations点击Add设置Installation home为实际的Maven的home路径，点击应用后选中这个新创建的即可
2. 创建工程时在Package Explorer右键然后new->Maven Project，打勾Create a simple project __（如果new后没有Maven Project这个选项，则Window->Perspective->Customize Perspective->Shortcuts->Maven->选中Maven Project即可）__
3. Eclipse中运行Maven命令：在pom.xml文件右键即可
## 导入Maven工程
在Package Explorer右键然后Import->Maven->Existing Maven Project->设置Root Directory为要导入工程的路径

