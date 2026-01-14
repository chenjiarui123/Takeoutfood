#!/bin/bash

echo "====================================="
echo "应用苍穹外卖 Nginx 配置"
echo "====================================="

# 配置文件路径
SOURCE_CONF="/Users/chenjr/Desktop/takeout-food-main/nginx-sky.conf"
TARGET_CONF="/opt/homebrew/etc/nginx/nginx.conf"

echo ""
echo "📝 配置信息："
echo "   源文件: $SOURCE_CONF"
echo "   目标文件: $TARGET_CONF"
echo ""
echo "⚠️  即将覆盖 nginx 配置文件"
echo ""

# 显示关键配置
echo "🔧 关键配置："
echo "   监听端口: 80"
echo "   前端文件: /Users/chenjr/Desktop/takeout-food-main/nginx-1.20.2/html/sky"
echo "   后端地址: http://localhost:8080"
echo ""

read -p "是否继续？(y/n): " confirm

if [ "$confirm" = "y" ] || [ "$confirm" = "Y" ]; then
    # 备份原配置
    echo ""
    echo "📦 备份原配置..."
    sudo cp "$TARGET_CONF" "$TARGET_CONF.backup.$(date +%Y%m%d_%H%M%S)"
    
    # 复制新配置
    echo "📋 应用新配置..."
    sudo cp "$SOURCE_CONF" "$TARGET_CONF"
    
    # 测试配置
    echo ""
    echo "🧪 测试配置文件..."
    if sudo nginx -t; then
        echo ""
        echo "✅ 配置文件语法正确！"
        
        # 检查 nginx 是否在运行
        if pgrep -x "nginx" > /dev/null; then
            echo ""
            echo "🔄 重新加载 nginx..."
            sudo nginx -s reload
            echo "✅ Nginx 已重新加载"
        else
            echo ""
            echo "🚀 启动 nginx..."
            sudo nginx
            echo "✅ Nginx 已启动"
        fi
        
        echo ""
        echo "====================================="
        echo "🎉 配置成功！"
        echo "====================================="
        echo ""
        echo "📱 访问地址："
        echo "   前端页面: http://localhost"
        echo "   管理端API: http://localhost/api/"
        echo "   用户端API: http://localhost/user/"
        echo ""
        echo "💡 提示："
        echo "   确保后端服务运行在 8080 端口"
        echo ""
    else
        echo ""
        echo "❌ 配置文件有误，请检查"
        exit 1
    fi
else
    echo ""
    echo "❌ 已取消操作"
    exit 0
fi
