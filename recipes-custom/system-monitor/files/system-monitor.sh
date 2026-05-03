#!/bin/sh
echo "=== System Monitor ==="
echo "CPU: $(grep 'cpu MHz' /proc/cpuinfo | head -1)"
echo "Memory: $(free -h | grep Mem)"
echo "Uptime: $(uptime)"

