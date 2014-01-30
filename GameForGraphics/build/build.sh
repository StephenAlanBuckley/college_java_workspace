export BUILD_CLASSPATH=$JAVA_HOME/lib/tools.jar
export BUILD_CLASSPATH=$BUILD_CLASSPATH:$ANT_EXTRAS:$GAME_BASE/lib/ant-launcher.jar
export BUILD_CLASSPATH=$BUILD_CLASSPATH:$GAME_BASE/lib/ant-junit.jar
export BUILD_CLASSPATH=$BUILD_CLASSPATH:$GAME_BASE/lib/ant.jar
export BUILD_CLASSPATH=$BUILD_CLASSPATH:$GAME_BASE/lib/ant-nodeps.jar

echo Base is $GAME_BASE
echo Building from $PWD
echo Build classpath $BUILD_CLASSPATH

java -cp $BUILD_CLASSPATH -Dant.home=$GAME_BASE/lib/ org.apache.tools.ant.launch.Launcher -buildfile $GAME_BASE/build/build.xml $1 $2 $3 $4 $5 $6 $7 $8 -DGAME_BASE=$GAME_BASE -DCURRENT_DIR=$PWD