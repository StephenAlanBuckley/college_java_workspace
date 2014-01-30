@echo off
IF NOT DEFINED GAME_BASE GOTO NOBASE

set "BUILD_CLASSPATH=%JAVA_HOME%\lib\tools.jar"
set "BUILD_CLASSPATH=%BUILD_CLASSPATH%;%GAME_BASE%\lib\ant-launcher.jar"
set "BUILD_CLASSPATH=%BUILD_CLASSPATH%;%GAME_BASE%\lib\ant-junit.jar"
set "BUILD_CLASSPATH=%BUILD_CLASSPATH%;%GAME_BASE%\lib\ant.jar"
set "BUILD_CLASSPATH=%BUILD_CLASSPATH%;%GAME_BASE%\lib\ant-nodeps.jar"

set BUILD_CMD_LINE_ARGS=

:setupArgs
if ""%1""=="""" goto doneStart
set BUILD_CMD_LINE_ARGS=%BUILD_CMD_LINE_ARGS% %1
shift
goto setupArgs

:doneStart

echo Current dir is %CD%
echo Current classpath is %BUILD_CLASSPATH%
echo Base is %GAME_BASE%
echo Commandline arguments are %BUILD_CMD_LINE_ARGS%
java -Xms512m -Xmx512m  -cp "%BUILD_CLASSPATH%" -Dant.home=%GAME_BASE%\lib\ org.apache.tools.ant.launch.Launcher  -buildfile %GAME_BASE%\build\build.xml %BUILD_CMD_LINE_ARGS% -lib -DGAME_BASE=%GAME_BASE% -DCURRENT_DIR=%CD%

GOTO DONE

:NOBASE
ECHO GAME_BASE must be set to continue...
GOTO DONE:

:DONE
