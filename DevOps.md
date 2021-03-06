#软件工程

其实要了解软件工程“有什么用”，最好能了解软件开发过程有多复杂（或者说为什么称之为“复杂”）。如果只是一个geek自己随便开发上千行代码的小系统，其实并不需要传统的软件工程方法。但是，如果开发的系统的规模上升到万行乃至十万行左右的规模，加上软件中各行代码间存在的千丝万缕的联系，普通人（即使是常常具有自我智力优越感的程序员）要继续开发并且维护这样一个系统就会变得捉襟见肘了。当现实中存在这种情况时，程序员们往往会说，这个系统“太复杂了”，或者会说这个系统“太乱了”。复杂原因在于程序员面对的问题规模（万行乃至于十万行左右的系统中千丝万缕的代码逻辑）超过了他人脑所能处理的极限。面对现实问题，比如，一个银行系统，我们很难改变它本身的规模，因为银行业务本身就很庞大，但是人们能做到的是降低那“庞然大物”内部的逻辑复杂性。更重要的是，很多时候，程序员在开发一个软件功能时并不需要完全了解整个系统的所有细节，他只需要专注于某个局部。这样，相比于系统规模，减少系统内部的逻辑耦合就更为重要。由此，软件工程的核心目的就在于做到这一点，简而言之，我们需要让整个软件系统“大而不乱”，井井有条。如果了解软件工程领域的相关知识，就会发现软件工程的准则，比如高内聚低耦合、构件化软件开发以及关注点分离等等，都是围绕这一目的提出的。当然，软件工程本身是一个很大的范畴，软件工程方面的研究也纷繁复杂，但最终目的都是要减少程序员工作的负荷并提高软件需求、设计、开发、测试、维护的效率。

# 软件危机
软件开发费用和进度失控</p>
软件的可靠性差</p>
生产出来的软件难以维护</p>

# 结构化程序设计
结构化程序设计主要表现在一下三个方面：

自顶向下，逐步求精。将编写程序看成是一个逐步演化的过程，将分析问题的过程划分成若干个层次，每一个新的层次都是上一个层次的细化。
模块化。将系统分解成若干个模块，每个模块实现特定的功能，最终的系统由这些模块组装而成，模块之间通过接口传递信息。
语句结构化。在每个模块中只允许出现顺序、分支和循环三种流程结构的语句。

# 面向对象程序设计
首先是分析需求，先不要思考怎么用程序实现它，先分析需求中稳定不变的客体都是些什么，这些客体之间的关系是什么；
把第一步分析出来的需求，通过进一步扩充模型，变成可实现的、符合成本的、模块化的、低耦合高内聚的模型；
使用面向对象的实现模型。

# 微服务架构模式

微服务是指开发一个单个小型的但有业务功能的服务，可以选择自己的技术栈和数据库，可以选择自己的通讯机制，可以部署在单个或多个服务器上。这里的“微”不是针对代码行数而言，而是说服务的范围不能大于DDD中的一个BC（Bounded Context，限界上下文）。

微服务架构模式的优点：

微服务只关注一个BC，业务简单</p>
不同微服务可由不同团队开发</p>
微服务是松散耦合的</p>
每个微服务可选择不同的编程语言和工具开发</p>
每个微服务可根据业务逻辑和负荷选择一个最合适的数据库</p>
微服务架构模式的挑战：</p>

分布式系统的复杂性，比如事务一致性、网络延迟、容错、对象持久化、消息序列化、异步、版本控制和负载等</p>
更多的服务意味着更高水平的DevOps和自动化技术</p>
服务接口修改会波及相关的所有服务</p>
服务间可能存在重复的功能点</p>
测试更加困难</p>

### 瀑布模型
是由W.W.Royce在1970年最初提出的软件开发模型，　瀑布式开发是一种老旧的计算机软件开发方法。
瀑布模型式是最典型的预见性的方法，严格遵循预先计划的需求分析、设计、编码、集成、测试、维护的步骤顺序进行。
步骤成果作为衡量进度的方法，例如需求规格，设计文档，测试计划和代码审阅等等。 

瀑布式的主要的问题是它的严格分级导致的自由度降低，项目早期即作出承诺导致对后期需求的变化难以调整，
代价高昂。瀑布式方法在需求不明并且在项目进行过程中可能变化的情况下基本是不可行的。 


### 迭代式开发也被称作迭代增量式开发或迭代进化式开发
是一种与传统的瀑布式开发相反的软件开发过程，它弥补了传统开发方式中的一些弱点，具有更高的成功率和生产率。
什么是迭代式开发？
每次只设计和实现这个产品的一部分, 
逐步逐步完成的方法叫迭代开发, 
每次设计和实现一个阶段叫做一个迭代. 

在迭代式开发方法中，整个开发工作被组织为一系列的短小的、
固定长度（如3周）的小项目，被称为一系列的迭代。
每一次迭代都包括了需求分析、设计、实现与测试。
采用这种方法，开发工作可以在需求被完整地确定之前启动，
并在一次迭代中完成系统的一部分功能或业务逻辑的开发工作。
再通过客户的反馈来细化需求，并开始新一轮的迭代。

迭代式开发的优点：
　　1、降低风险
　　2、得到早期用户反馈
　　3、持续的测试和集成
　　4、使用变更
　　5、提高复用性



### 螺旋开发
1988年，巴利·玻姆(Barry Boehm)正式发表了软件系统开发的“螺旋模型”，它将瀑布模型和快速原型模型结合起来，强调了其他模型所忽视的风险分析，特别适合于大型复杂的系统。
“螺旋模型”刚开始规模很小，当项目被定义得更好、更稳定时，逐渐展开。 

　　“螺旋模型”的核心就在于您不需要在刚开始的时候就把所有事情都定义的清清楚楚。您轻松上阵，定义最重要的功能，实现它，然后听取客户的意见，之后再进入到下一个阶段。如此不断轮回重复，直到得到您满意的最终产品。 
       （1）制定计划：确定软件目标，选定实施方案，弄清项目开发的限制条件； 

　　（2）风险分析：分析评估所选方案，考虑如何识别和消除风险； 

　　（3）实施工程：实施软件开发和验证； 

　　（4）客户评估：评价开发工作，提出修正建议，制定下一步计划。 
螺旋模型很大程度上是一种风险驱动的方法体系，因为在每个阶段之前及经常发生的循环之前，都必须首先进行风险评估。


　



###敏捷软件开发又称敏捷开发
是一种从1990年代开始逐渐引起广泛关注的一些新型软件开发方法，是一种应对快速变化的需求的一种软件开发能力。它们的具体名称、理念、过程、术语都不尽相同，相对于“非敏捷”，更强调程序员团队与业务专家之间的紧密协作、面对面的沟通（认为比书面的文档更有效）、频繁交付新的软件版本、紧凑而自我组织型的团队、能够很好地适应需求变化的代码编写和团队组织方法，也更注重软件开发中人的作用。


人和交互 重于过程和工具。
可以工作的软件 重于求全而完备的文档。
客户协作重于合同谈判。
随时应对变化重于循规蹈矩。

其中位于右边的内容虽然也有其价值，但是左边的内容最为重要。
人员彼此信任 人少但是精干 可以面对面的沟通

项目的敏捷开发：
敏捷开发小组主要的工作方式可以归纳为：作为一个整体工作； 按短迭代周期工作； 每次迭代交付一些成果； 
关注业务优先级； 检查与调整。

最重要的因素恐怕是项目的规模。规模增长，面对面的沟通就愈加困难，
因此敏捷方法更适用于较小的队伍，40、30、20、10人或者更少。
大规模的敏捷软件开发尚处于积极研究的领域。




##四者对比区别：

传统的瀑布式开发，也就是从需求到设计，从设计到编码，从编码到测试，从测试到提交大概这样的流程，要求每一个开发阶段都要做到最好。
特别是前期阶段，设计的越完美，提交后的成本损失就越少。

迭代式开发，不要求每一个阶段的任务做的都是最完美的，而是明明知道还有很多不足的地方，却偏偏不去完善它，而是把主要功能先搭建起来为目的，以最短的时间，
最少的损失先完成一个“不完美的成果物”直至提交。然后再通过客户或用户的反馈信息，在这个“不完美的成果物”上逐步进行完善。

螺旋开发，很大程度上是一种风险驱动的方法体系，因为在每个阶段之前及经常发生的循环之前，都必须首先进行风险评估。

敏捷开发，相比迭代式开发两者都强调在较短的开发周期提交软件，但是，敏捷开发的周期可能更短，并且更加强调队伍中的高度协作。
敏捷方法有时候被误认为是无计划性和纪律性的方法，实际上更确切的说法是敏捷方法强调适应性而非预见性。 

适应性的方法集中在快速适应现实的变化。当项目的需求起了变化，团队应该迅速适应。这个团队可能很难确切描述未来将会如何变化.




# DevOps
### 解释
DevOps（Development和Operations的组合词）是一种重视“软件开发人员（Dev）”和“IT运维技术人员（Ops）”之间沟通合作的文化、运动或惯例。透过自动化“软件交付”和“架构变更”的流程，来使得构建、测试、发布软件能够更加地快捷、频繁和可靠。可以把**DevOps看作开发（软件工程）、技术运营和质量保障（QA）**三者的交集

传统的软件组织将开发、IT运营和质量保障设为各自分离的部门，在这种环境下如何采用新的开发方法（例如敏捷软件开发），是一个重要的课题。按照从前的工作方式，开发和部署，不需要IT支持或者QA深入的跨部门的支持；而现在却需要极其紧密的多部门协作。而DevOps考虑的还不止是软件部署，它是一套针对这几个部门间沟通与协作问题的流程和方法。

需要频繁交付的企业可能更需要对DevOps有一个大致的了解。Flickr发展了自己的DevOps能力，使之能够支撑业务部门“每天部署10次”的要求──如果一个组织要生产面向多种用户、具备多样功能的应用程序，其部署周期必然会很短。这种能力也被称为持续部署，并且经常与精益创业方法联系起来。从2009年起，相关的工作组、专业组织和博客快速涌现。

DevOps的引入能对产品**交付、测试、功能开发和维护**（包括──曾经罕见但如今已屡见不鲜的──“热补丁”）起到意义深远的影响。在缺乏DevOps能力的组织中，开发与运营之间存在着信息“鸿沟”──例如运营人员要求更好的可靠性和安全性，开发人员则希望基础设施响应更快，而业务用户的需求则是更快地将更多的特性发布给最终用户使用。这种信息鸿沟就是最常出问题的地方。

以下几方面因素可能促使一个组织引入DevOps：

使用敏捷或其他软件开发过程与方法</p>
业务负责人要求加快产品交付的速率</p>
虚拟化[13]和云计算基础设施（可能来自内部或外部供应商）日益普遍</p>
数据中心自动化技术[14]和配置管理工具的普及</p>
有一种观点认为，目前占主导地位的“传统”美国式管理风格（“斯隆模型 vs 丰田模型”）[15]会导致“烟囱式自动化”，从而造成开发与运营之间的鸿沟，因此需要DevOps能力来克服由此引发的问题。</p>
DevOps经常被描述为“开发团队与运营团队之间更具协作性、更高效的关系”。由于团队间协作关系的改善，整个组织的效率因此得到提升，伴随频繁变化而来的生产环境的风险也能得到降低。</p>
</p>

## 对应用程序发布的影响
在很多企业中，应用程序发布是一项涉及多个团队、压力很大、风险很高的活动。然而在具备DevOps能力的组织中，应用程序发布的风险很低，原因如下：


与传统开发方法那种大规模的、不频繁的发布（通常以“季度”或“年”为单位）相比，敏捷方法大大提升了发布频率（通常以“天”或“周”为单位）
## 减少变更范围
与传统的瀑布式开发模型相比，采用敏捷或迭代式开发意味着更频繁的发布、每次发布包含的变化更少。由于部署经常进行，因此每次部署不会对生产系统造成巨大影响，应用程序会以平滑的速率逐渐生长。
## 加强发布协调
靠强有力的发布协调人来弥合开发与运营之间的技能鸿沟和沟通鸿沟；采用电子数据表、电话会议、即时消息、企业门户（wiki、sharepoint）等协作工具来确保所有相关人员理解变更的内容并全力合作。
## 自动化
强大的部署自动化手段确保部署任务的可重复性、减少部署出错的可能性。
## 现状
很多组织将开发和系统管理划分成不同的部门。开发部门的驱动力通常是“频繁交付新特性”，而运营部门则更关注IT服务的可靠性和IT成本投入的效率。两者目标的不匹配，就在开发与运营部门之间造成了鸿沟，从而减慢了IT交付业务价值的速度。</p>

开发人员经常不考虑自己写的代码会对运营造成什么影响。他们在交付代码之前，并不邀请运营人员参与架构决策或代码评审。</p>
开发人员对配置或环境进行修改之后，经常没有及时与运营人员沟通，导致新的代码不能运行。</p>
开发人员在自己的机器上手工修改配置，而没有记录所有需要的步骤。想找到必要的配置参数，通常需要尝试很多不同的参数；在得到一个可工作的状态后，往往很难识别出通过哪些最小步骤就能到达该状态。</p>
开发人员倾向于使用有利于快速开发的工具：对代码修改更快的反馈，更低的内存消耗，等等。这样的工具集与运营人员面对的目标运行时环境非常不同：后者对稳定性和性能的要求远胜于灵活性。</p>
由于开发人员平时使用桌面计算机，他们倾向于使用为桌面用户优化的操作系统。生产环境的运行时系统通常都运行服务器操作系统上。</p>
在开发过程中，系统在开发者的本地机器上运行。在运营过程中，系统经常分布在多台服务器上，例如web服务器、应用服务器、数据库服务器等等。</p>
开发是由功能性需求（通常与业务需求直接相关）驱动的。</p>
运营是由非功能性需求（例如可获得性、可靠性、性能等）驱动的。</p>
运营人员希望尽量避免修改功能，从而降低满足非功能性需求的风险</p>
如果拒绝了小的修改，但给定时间段内需要修改的总量不变，那么每次变更的规模就会变大</p>
变更规模越大，风险也越大，因为其中涉及的区域越多</p>
由于运营人员尝试避免变更，新功能流入生产环境的速度因此被延缓，从而延缓了开发人员将特性交付给用户使用的速度。</p>
运营人员可能对应用程序内部缺乏了解，从而难以正确地选择运行时环境和发布流程。</p>
开发人员可能对运行时环境缺乏了解，从而难以正确地对代码进行调整。</p>
诉求</p>
更小、更频繁的变更──意味着更少的风险</p>
让开发人员更多地控制生产环境</p>
更多地以应用程序为中心来理解基础设施</p>
定义简洁明了的流程</p>
尽可能地自动化</p>
促成开发与运营的协作</p>

一般而言，当企业希望将原本笨重的开发与运营之间的工作移交过程变得流畅无碍，他们通常会遇到以下三类问题：

##发布管理问题
很多企业有发布管理问题。他们需要更好的发布计划方法，而不止是一份共享的电子数据表。他们需要清晰了解发布的风险、依赖、各阶段的入口条件，并确保各个角色遵守既定流程行事。
##发布/部署协调问题
有发布/部署协调问题的团队需要关注发布/部署过程中的执行。他们需要更好地跟踪发布状态、更快地将问题上升、严格执行流程控制和细粒度的报表。
##发布/部署自动化问题
这些企业通常有一些自动化工具，但他们还需要以更灵活的方式来管理和驱动自动化工作──不必要将所有手工操作都在命令行中加以自动化。理想情况下，自动化工具应该能够在非生产环境下由非运营人员使用。
要开始优化发布流程，可以从问题识别开始：看看上面提到的哪种问题在你的团队中具有最高的优先级。

## 发布协调人
这是企业级IT组织中一个新出现的角色，其主要任务就是协调安排将企业级软件部署到预生产环境。对发布协调人的需求来自于以下几方面原因：

## 需要弥合开发与运营的鸿沟
基础设施日益变得复杂：为了运营web应用，需要多层基础设施和多种平台
发布频率上升（由于敏捷和迭代式开发的引入）
分布式团队：位于全球多个地点的、包含外包人员的、混合开发/测试/基础设施的团队
发布协调人的角色（也被称为部署协调人或集成协调人）源自发布管理或发布工程团队。这个角色与航空交通管制有些类似──实时协调不同团队的行动，有效使用共享的资源（空域、航道、跑道、航站门），达到组织的总体目标（安全起降）。

传统意义上的发布管理往往只关注软件变更的计划与管理，发布协调则需要控制“将特定软件变更发布至生产环境”的整个过程。这项工作需要系统地管理所有与“将代码构建并部署到生产环境”相关的技术任务，也被称为“发布工程”。

变更管理是跟踪企业IT环境中各种变化──不管是应用程序还是基础设施的变化──的基本原则。变更管理是ITIL v3的核心之一。

